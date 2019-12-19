package com.example.demo.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liuqi
 * @Title: SystemTest
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/11/2116:03
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SystemTest {

    @Test
    public void test(){
        String getenv = System.getProperty("java.version");

        long l = System.currentTimeMillis();
        System.out.println(l);
    }
}
