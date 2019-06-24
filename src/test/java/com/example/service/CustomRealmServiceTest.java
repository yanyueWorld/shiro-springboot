package com.example.service;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * //TODO description end with .
 *
 * @author yanyue, 2019/6/21
 * @version Araf v1.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomRealmServiceTest {
    @Autowired
    private CustomRealmService customRealmService;
    @Test
    public void getPasswordByUsername() {
        System.out.println(customRealmService.getPasswordByUsername("张三"));
    }

    @Test
    public void getSaltByUsername() {
        System.out.println(customRealmService.getSaltByUsername("张三"));
    }

    @Test
    public void getPermissionsByUsername() {
        System.out.println(customRealmService.getPermissionsByUsername("张三"));
    }

    @Test
    public void getRolesByUsername() {
        System.out.println(customRealmService.getRolesByUsername("张三"));
    }

    @Test
    public void isTrue(){
        String password=customRealmService.getPasswordByUsername("张三");
        String input="admin";
        String salt=customRealmService.getSaltByUsername("张三");
        Md5Hash md5Hash=new Md5Hash(input,salt);
        System.out.println(password);
        System.out.println(md5Hash);
        if(password.equals(md5Hash.toString())){
            System.out.printf("true");
        }
    }
}