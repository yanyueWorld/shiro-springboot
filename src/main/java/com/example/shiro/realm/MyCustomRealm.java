package com.example.shiro.realm;

import com.example.service.CustomRealmService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * CustomerRealm 自定义Realm .
 *
 * @author yanyue, 2019/6/21
 * @version shiro v2.0
 */

@Component
public class MyCustomRealm extends AuthorizingRealm {

    @Autowired
    private CustomRealmService customRealmService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String username = (String) principals.getPrimaryPrincipal();
        Set<String> roles = customRealmService.getRolesByUsername(username);
        Set<String> permission = customRealmService.getPermissionsByUsername(username);
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.setRoles(roles);
        info.setStringPermissions(permission);
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String) token.getPrincipal();
        String password = customRealmService.getPasswordByUsername(username);

        if (password == null) {
            return null;
        }
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(token.getPrincipal(), password, getName());
        String salt = customRealmService.getSaltByUsername(username);
        info.setCredentialsSalt(ByteSource.Util.bytes(salt));
        return info;
    }
}
