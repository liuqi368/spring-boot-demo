package com.example.dao;

import com.example.model.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author liuqi
 * @Title: UserDODao
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/5/611:01
 */
public interface UserDODao extends JpaRepository<UserDO, Long> {
}

