package com.example.dao;

import com.example.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;


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
        User user=userDao.getUserByUsername("张三");
        assertThat(user,notNullValue());
        log.info(user.toString());
    }
}