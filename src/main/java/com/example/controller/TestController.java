package com.example.controller;

import com.example.config.RandomConfig;
import com.example.config.TestConfig;
import com.example.model.TestBean;
import com.example.service.TestService;
import org.apache.catalina.core.ApplicationContext;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * @author liuqi
 * @Title: TestController
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/5/2914:11
 */
@RestController
@RequestMapping("testMore")
public class TestController {

    @Resource
    @Qualifier("testOneService")
    private TestService testService;

    @Resource
    private RandomConfig randomConfig;

    @RequestMapping("testOne")
    public Map<String ,Object> testOne(){
        return testService.queryList();
    }


    @RequestMapping("testBean")
    public void testBean(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);

        TestBean tb = (TestBean) context.getBean("testBean");
        tb.sayHello();
        System.out.println(tb);

        TestBean tb2 = (TestBean) context.getBean("testBean");
        tb2.sayHello();
        context.close();
        System.out.println(tb2);
    }

    @GetMapping("randomTest")
    @ResponseBody
    public Map randomTest(){
        Map map=new HashMap();

        map.put("随机字符串 : " ,randomConfig.getSecret());

        map.put("随机int : " , randomConfig.getIntNumber());

        map.put("随机long : " , randomConfig.getLongNumber());

        map.put("随便uuid : " , randomConfig.getUuid());

        map.put("随机10以内的数字 : " , randomConfig.getLessTen());

        return map;
    }
}
