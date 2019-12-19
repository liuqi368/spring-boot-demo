package com.example.demo.config;

import com.example.config.RandomConfig;
import com.example.ws.WebSocketServer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author liuqi
 * @Title: randomtest
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/5/3018:25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class randomTest {

    private final static Logger log = LoggerFactory.getLogger(randomTest.class);

    @Resource
    private RandomConfig randomConfig;

    @Test
    public void test1() throws Exception {

         log.info("随机数测试输出：");

         log.info("随机字符串 : " + randomConfig.getSecret());

         log.info("随机int : " + randomConfig.getIntNumber());

         log.info("随机long : " + randomConfig.getLessTen());

         log.info("随便uuid : " + randomConfig.getRange());

         log.info("随机10以内的数字 : " + randomConfig.getLongNumber());

         }
}
