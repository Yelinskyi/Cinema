package project.cinema.spring.security;

import static org.springframework.security.core.userdetails.User.withUsername;

import java.util.Optional;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import project.cinema.spring.model.User;
import project.cinema.spring.service.UserService;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private UserService userService;

    public CustomUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> optionalUser = userService.findByEmail(userName);
        if (optionalUser.isEmpty()) {
            throw new UsernameNotFoundException("User is not found");
        }
        User user = optionalUser.get();
        UserBuilder userBuilder;
        userBuilder = withUsername(userName);
        userBuilder.password(user.getPassword());
        userBuilder.roles(
                user.getRoles()
                        .stream()
                        .map(role -> role.getName().toString())
                        .toArray(String[]::new)
        );
        return userBuilder.build();
    }
}
