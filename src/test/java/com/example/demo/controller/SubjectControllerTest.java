package com.example.demo.controller;

import com.example.service.ISubject;
import com.example.service.impl.DynamicProxyHandler;
import com.example.service.impl.ProxySubject;
import com.example.service.impl.RealSubject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * java代理模式测试类
 * @author liuqi
 * @Title: SubjectControllerTest
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/6/1913:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SubjectControllerTest {

    @Test
    public void testStatical() {
        ProxySubject proxySubject = new ProxySubject(new RealSubject());
        proxySubject.doMain("play");
    }

    @Test
    public void testProxyHandler() {
        ISubject subject = new RealSubject();
        ISubject proxy = new DynamicProxyHandler(subject).getProxy();
        proxy.doMain("play");
        proxy.doString("tomorrow");
    }

}
