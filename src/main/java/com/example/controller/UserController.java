package com.example.controller;

/**
 * @author liuqi
 * @Title: UserController
 * @ProjectName spring-boot-demo
 * @Description: TODO
 * @date 2018/10/1611:09
 */

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.model.UserEntity;
import com.example.service.UserService;
import org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@SpringBootApplication
//表示该controller类下所有的方法都公用的一级上下文根
@ComponentScan(basePackages={"com.example.service"})//添加的注解
public class UserController {
    private Logger log = LoggerFactory.getLogger(UserController.class);

    @Resource(name = "userService")
    public UserService userService;

    @RequestMapping("user")
    public List<UserEntity> userGet() {
        String ii="jinim";
        return userService.userList(ii);
    }
    @RequestMapping("/home")
    public String home() {
        String resultMsg="";
        Map map =new HashMap();
        if(!map.isEmpty()){
            String str = map.get(0).toString();
        }else{
            throw new RuntimeException("返回map为空");
        }

       /* try {
            Map map =new HashMap();
            String str = map.get(0).toString();
        } catch (NullPointerException  e) {
            new RuntimeException("Map 为空！",e);
        }*/
       return resultMsg;
    }

    public void main(String[] args) {
        String ii="jinim";
        userService.userList(ii);
    }

    @RequestMapping("/login")
    public String SelectUser(){
        return "where are you going";
    }
}
