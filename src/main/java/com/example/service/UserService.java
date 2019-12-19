package com.example.service;

import com.example.model.UserEntity;

import java.util.List;

/**
 * @author liuqi
 * @Title: UserService
 * @ProjectName spring-boot-demo
 * @Description: TODO
 * @date 2018/10/1616:02
 */
public interface UserService {
    List<UserEntity> userList(String name);
}
