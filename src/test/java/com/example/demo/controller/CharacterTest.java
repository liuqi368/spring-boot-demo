package com.example.demo.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liuqi
 * @Title: CharacterTest
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/11/2117:27
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CharacterTest {

    @Test
    public void test(){

        //Character.isLetter() 方法用于判断指定字符是否为字母。
        boolean d = Character.isLetter('d');

        //Character.isDigit() 方法用于判断指定字符是否为数字。
        boolean c = Character.isDigit('c');

        //Character.isWhitespace() 方法用于判断指定字符是否为空白字符，空白符包含：空格、tab键、换行符。
        boolean nu = Character.isWhitespace(' ');

        //Character.isUpperCase() 方法用于判断指定字符是否为大写字母。
        boolean b = Character.isUpperCase('H');

        //Character.isLowerCase() 方法用于判断指定字符是否为小写字母。
        boolean s = Character.isLowerCase('c');

        //Character.toUpperCase() 方法用于将小写字符转换为大写。
        char L = Character.toUpperCase('l');

        //Character.toLowerCase() 方法用于将大写字符转换为小写。
        char l = Character.toLowerCase('L');

        //toString() 方法用于返回一个表示指定 char 值的 String 对象。结果是长度为 1 的字符串，仅由指定的 char 组成。
        String f = Character.toString('f');



    }
}
