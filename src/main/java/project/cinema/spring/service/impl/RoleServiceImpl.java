package project.cinema.spring.service.impl;

import org.springframework.stereotype.Service;
import project.cinema.spring.dao.RoleDao;
import project.cinema.spring.model.Role;
import project.cinema.spring.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role add(Role role) {
        return roleDao.add(role);
    }
}
