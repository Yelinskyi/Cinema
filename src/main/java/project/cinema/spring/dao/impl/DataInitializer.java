package project.cinema.spring.dao.impl;

import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import project.cinema.spring.model.Role;
import project.cinema.spring.model.RoleType;
import project.cinema.spring.model.User;
import project.cinema.spring.service.RoleService;
import project.cinema.spring.service.UserService;

@Repository
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;

    public DataInitializer(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setName(RoleType.ADMIN);
        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setName(RoleType.USER);
        roleService.add(userRole);
        User bob = new User();
        bob.setEmail("admin@i.ua");
        bob.setPassword("admin123");
        bob.setRoles(Set.of(adminRole));
        User alice = new User();
        alice.setEmail("user@i.ua");
        alice.setPassword("user123");
        alice.setRoles(Set.of(userRole));
        userService.add(bob);
        userService.add(alice);
    }
}
