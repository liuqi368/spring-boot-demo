package com.example.demo.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.bind.ValidationEvent;

/**
 * @author liuqi
 * @Title: VariableControllerTest
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/9/116:51
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class VariableControllerTest {

    private final String attribute_b;

    {
        attribute_b = "zhangbingxiao";
    }
    /*static {
        attribute_b = "zhangbingxiao";
    }*/
    /*public VariableControllerTest(String attribute_b){
        this.attribute_b = attribute_b;
    }*/

    @Test
    public void test(){

    }
}
