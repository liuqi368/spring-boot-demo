package com.example.demo;

import com.example.dao.UserDODao;
import com.example.dao.UserDao;
import com.example.model.UserDO;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private UserDODao userDao;

	@Before
	public void before() {
		UserDO userDO = new UserDO();
		userDO.setId(1L);
		userDO.setName("风清扬");
		userDO.setAccount("fengqy");
		userDO.setPwd("123456");
		userDao.save(userDO);
		userDO = new UserDO();
		userDO.setId(3L);
		userDO.setName("东方不败");
		userDO.setAccount("bubai");
		userDO.setPwd("123456");
		userDao.save(userDO);
		userDO.setId(5L);
		userDO.setName("向问天");
		userDO.setAccount("wentian");
		userDO.setPwd("123456");
		userDao.save(userDO);
	}
	@Test
	public void contextLoads() {
		UserDO userDO = new UserDO();
		userDO.setId(2L);
		userDO.setName("任我行");
		userDO.setAccount("renwox");
		userDO.setPwd("123456");
		userDao.save(userDO);
		userDO = new UserDO();
		userDO.setId(4L);
		userDO.setName("令狐冲");
		userDO.setAccount("linghuc");
		userDO.setPwd("123456");
		userDao.save(userDO);
		System.out.print(userDao.findAll());
	}
	@After
	public void after() {
		userDao.deleteById(1L);
		userDao.deleteById(3L);
		userDao.deleteById(5L);
	}


}
