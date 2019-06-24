package com.example.service;

import java.util.Set;

/**
 * CustomRealmService 自定义Realm业务接口层 .
 *
 * @author yanyue, 2019/6/21
 * @version shiro v2.0
 */
public interface CustomRealmService {
    String getPasswordByUsername(String username);

    String getSaltByUsername(String username);

    Set<String> getPermissionsByUsername(String username);

    Set<String> getRolesByUsername(String username);
}
