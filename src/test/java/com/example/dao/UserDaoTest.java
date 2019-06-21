package com.example.dao;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * UserDaoTest 用户Dao层测试类.
 *
 * @author yanyue, 2019/6/21
 * @version shiro v2.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserDaoTest {

    @Autowired
    private UserDao userDao;
    @Test
    public void selectByPrimaryKey() {
        System.out.println(userDao.selectByPrimaryKey(1));
    }
}