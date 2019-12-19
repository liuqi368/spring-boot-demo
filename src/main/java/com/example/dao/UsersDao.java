package com.example.dao;

import com.example.model.UserEntity;

import java.util.ArrayList;
import java.util.Map;

/**
 * @author liuqi
 * @Title: UserDao
 * @ProjectName spring-boot-demo
 * @Description: TODO
 * @date 2018/10/1616:05
 */
public interface UsersDao {
     ArrayList<UserEntity> usersList(Map map);
}
