package com.example.demo.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Clock;
import java.time.LocalDateTime;
import java.util.Calendar;

/**
 * @author liuqi
 * @Title: DateTest
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/11/1018:11
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DateTest {

    @Test
    public void getDate(){
        Calendar car = Calendar.getInstance();
        System.out.println(car.get(Calendar.YEAR));
        LocalDateTime loc = LocalDateTime.now();
        loc.getYear();
        System.out.println(Clock.systemDefaultZone().millis());
    }
}
