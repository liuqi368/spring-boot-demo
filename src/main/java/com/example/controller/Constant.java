package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liuqi
 * @Title: Constant
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/8/312:55
 */
@RequestMapping("/constant")
@Controller
public class Constant {

    @RequestMapping("/test")
    public void test(){

        Integer i1 = new Integer(1);

        Integer i2 = new Integer(1);

        System.out.println(i1 == i2);//false

        Integer i3 = 1;
        Integer i4 = 1;

        System.out.println(i3 == i4);//true

        System.out.println(i1 == i3);//false
    }


}
