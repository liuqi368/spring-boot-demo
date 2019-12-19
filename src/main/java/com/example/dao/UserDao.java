package com.example.dao;

import com.example.model.UserEntity;
import org.jboss.logging.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Map;

/**
 * @author liuqi
 * @Title: UserDao
 * @ProjectName spring-boot-demo
 * @Description: TODO
 * @date 2018/10/1616:05
 */
public interface UserDao {
     ArrayList<UserEntity> usersList(Map map);
}
