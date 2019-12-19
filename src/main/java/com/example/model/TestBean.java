package com.example.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author liuqi
 * @Title: TestBean
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/5/2916:10
 */
//添加注册bean的注解
//@Component()
//@Scope("singleton")
public class TestBean {

    private String username;
    private String url;
    private String password;

    public void sayHello() {
        System.out.println("TestBean sayHello...");
    }

   /* public String toString() {
        return "username:" + this.username + ",url:" + this.url + ",password:" + this.password;
    }*/

    //@PostConstruct
    public void start() {
        System.out.println("TestBean 初始化。。。");
    }

    //@PreDestroy
    public void cleanUp() {
        System.out.println("TestBean 销毁。。。");
    }
}
