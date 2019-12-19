package com.example.demo.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Random;

/**
 * @author liuqi
 * @Title: RandomTest
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/11/2117:38
 */

/**
 * Random类中实现的随机算法是伪随机，也就是有规则的随机。在进行随机时，随机算法的起源数字称为种子数(seed)，
 * 在种子数的基础上进行一定的变换，从而产生需要的随机数字。
 * 相同种子数的Random对象，
 * 相同次数生成的随机数字是完全相同的。也就是说，两个种子数相同的Random对象，
 * 第一次生成的随机数字完全相同，第二次生成的随机数字也完全相同。这点在生成多个随机数字时需要特别注意。
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RandomTest {

    @Test
    public void test(){

        Random r = new Random();

        //a、生成[0,1.0)区间的小数
        double d1 = r.nextDouble();

        //b、生成[0,5.0)区间的小数
        double d2 = r.nextDouble() * 5;

        //c、生成[1,2.5)区间的小数
        double d3 = r.nextDouble() * 1.5 + 1;

        //d、生成任意整数
        int n1 = r.nextInt();

        //e、生成[0,10)区间的整数
        int n2 = r.nextInt(10);
        n2 = Math.abs(r.nextInt() % 10);

        //f、生成[0,10]区间的整数
        int n3 = r.nextInt(11);
        n3 = Math.abs(r.nextInt() % 11);

        //g、生成[-3,15)区间的整数
        int n4 = r.nextInt(18) - 3;
        n4 = Math.abs(r.nextInt() % 18) - 3;
    }
}
