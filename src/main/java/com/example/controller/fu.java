package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuqi
 * @Title: fu
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/7/1216:24
 */
@RequestMapping("/fu")
@RestController
public class fu {

    @RequestMapping("doing")
    protected   void doing(){
        talking();
    }

    protected void talking(){
        System.out.println("father is talking!");
    }




}
