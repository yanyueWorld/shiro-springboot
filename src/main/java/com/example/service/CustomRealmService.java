package com.example.service;

import java.util.Set;

/**
 * CustomRealmService 自定义Realm业务接口层 .
 *
 * @author yanyue, 2019/6/21
 * @version shiro v1.0
 */
public interface CustomRealmService {

    /**
     * 通过用户名获取密码.
     *
     * @param username 用户名
     * @return String 密码
     */
    String getPasswordByUsername(String username);

    /**
     * 通过用户名获取盐值.
     *
     * @param username 用户名
     * @return String 盐值
     */
    String getSaltByUsername(String username);

    /**
     * 通过用户名获取权限.
     *
     * @param username 用户名
     * @return Set<String> 权限集合
     */
    Set<String> getPermissionsByUsername(String username);

    /**
     * 通过用户名获取角色.
     *
     * @param username 用户名
     * @return Set<String> 角色集合
     */
    Set<String> getRolesByUsername(String username);
}
