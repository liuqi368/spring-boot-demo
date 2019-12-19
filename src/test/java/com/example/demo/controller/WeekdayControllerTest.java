package com.example.demo.controller;

import com.example.controller.WeekdayController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liuqi
 * @Title: EnmuControllerTest
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/6/2420:24
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class WeekdayControllerTest {

    @Test
    public void valueOf(){
        System.out.println(WeekdayController.valueOf("SUN"));
    }

    @Test
    public  void ordinal(){
        System.out.println(WeekdayController.SUN.ordinal());
    }
}
