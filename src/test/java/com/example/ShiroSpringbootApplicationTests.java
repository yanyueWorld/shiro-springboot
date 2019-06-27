package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@MapperScan("com.example.dao")
@SpringBootTest
public class ShiroSpringbootApplicationTests {

    @Test
    public void contextLoads() {
    }

}
