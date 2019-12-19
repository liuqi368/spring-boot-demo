package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.model.UserEntity;
import com.example.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liuqi
 * @Title: UserServiceImpl
 * @ProjectName spring-boot-demo
 * @Description: TODO
 * @date 2018/10/1616:04
 */
@Service("userService")
@ComponentScan(basePackages={"com.example.dao"})
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<UserEntity> userList(String loginName) {
        Map map=new HashMap();
        map.put("loginName","test1");

       return userDao.usersList(map);
    }
}
