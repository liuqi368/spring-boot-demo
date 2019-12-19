package com.example.controller;

import com.example.model.UserEntity;
import com.example.model.UserEntity1;
import com.example.utils.RedisUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author liuqi
 * @Title: RedisController
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/7/816:28
 */
@RequestMapping("/redis")
@RestController
public class RedisController {
    private static int ExpireTime = 60;   // redis中存储的过期时间60s

    @Resource
    private RedisUtil redisUtil;

    @RequestMapping("set")
    public boolean redisset(String key, String value){
        UserEntity userEntity =new UserEntity();
        userEntity.setId(1);

        userEntity.setName("zhangsan");


        //return redisUtil.set(key,userEntity,ExpireTime);

        return redisUtil.set(key,value);
    }

    @RequestMapping("get")
    public Object redisget(String key){
        return redisUtil.get(key);
    }

    @RequestMapping("expire")
    public boolean expire(String key){
        return redisUtil.expire(key,ExpireTime);
    }
}
