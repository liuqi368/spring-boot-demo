package com.example.demo.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liuqi
 * @Title: ConstantTest
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/8/313:01
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ConstantTest {

    @Test
    public void test01(){
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);

        System.out.println(i1 == i2);//false

        Integer i3 = 127;
        Integer i4 = 127;

        System.out.println(i3 == i4);//true
        System.out.println(i1 == i3);//false
    }

    @Test
    public void test02(){
        Integer i1 = 128;
        Integer i2 = 128;

        System.out.println(i1 ==i2);//false

        Integer i3 = 127;
        Integer i4 = 127;

        System.out.println(i3 == i4);//true

        int i5 = 169;
        int i6 = 169;
        System.out.println(i5 == i6);
    }
}
