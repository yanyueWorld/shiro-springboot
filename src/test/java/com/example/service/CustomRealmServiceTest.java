package com.example.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * CustomRealmServiceTest 自定义Realm业务逻辑层测试.
 *
 * @author yanyue, 2019/6/21
 * @version shiro v1.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class CustomRealmServiceTest {
    @Autowired
    private CustomRealmService customRealmService;

    @Test
    public void getPasswordByUsername() {
        String username = "张三";
        assertThat(username, notNullValue());
        String password = customRealmService.getPasswordByUsername(username);
        assertThat(password, notNullValue());
        log.info(password);
    }

    @Test
    public void getSaltByUsername() {
        String username = "张三";
        assertThat(username, notNullValue());
        String salt = customRealmService.getSaltByUsername(username);
        assertThat(salt, notNullValue());
        log.info(username);
    }

    @Test
    public void getPermissionsByUsername() {
        String username = "张三";
        assertThat(username, notNullValue());
        Set<String> permissions = customRealmService.getPermissionsByUsername(username);
        assertThat(permissions, notNullValue());
        log.info(permissions.toString());
    }

    @Test
    public void getRolesByUsername() {
        String username = "张三";
        assertThat(username, notNullValue());
        Set<String> roles = customRealmService.getRolesByUsername(username);
        assertThat(roles, notNullValue());
        log.info(roles.toString());
    }


}