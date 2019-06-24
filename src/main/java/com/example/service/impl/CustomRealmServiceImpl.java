package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.pojo.Permission;
import com.example.pojo.Role;
import com.example.pojo.User;
import com.example.service.CustomRealmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * CustomRealmServiceImpl 自定义Realm业务逻辑实现类.
 *
 * @author yanyue, 2019/6/21
 * @version shiro v2.0
 */
@Service
public class CustomRealmServiceImpl implements CustomRealmService {

    @Autowired
    private UserDao userDao;

    private User getUser(String username) {
        if (username == null || username.length() == 0) {
            return null;
        }
        User user = userDao.getUserByUsername(username);
        if (user == null) {
            return null;
        }
        System.out.println(user);
        return user;
    }

    @Override
    public String getPasswordByUsername(String username) {
        User user = getUser(username);
        return user.getPassword();
    }

    @Override
    public String getSaltByUsername(String username) {
        User user = getUser(username);
        return user.getSalt();
    }

    @Override
    public Set<String> getRolesByUsername(String username) {
        User user = getUser(username);
        Set<String> roleNames = new HashSet<>();
        for (Role role : user.getRoles()) {
            roleNames.add(role.getName());
        }
        System.out.println("roleNames==>" + roleNames);
        return roleNames;
    }

    @Override
    public Set<String> getPermissionsByUsername(String username) {
        User user = getUser(username);
        Set<String> permissions = new HashSet<>();
        for (Role role : user.getRoles()) {
            for (Permission permission : role.getPermissions()) {
                permissions.add(permission.getPerms());
            }
        }
        System.out.println("permissions==>" + permissions);
        return permissions;
    }


}
