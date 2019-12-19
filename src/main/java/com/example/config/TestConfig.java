package com.example.config;

import com.example.model.TestBean;
import org.hibernate.annotations.Filter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author liuqi
 * @Title: TestConfig
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/5/2916:03
 */
@Configuration
//添加自动扫描注解，basePackages为TestBean包路径
@ComponentScan(basePackages = "com.example.model")
public class TestConfig {

    public TestConfig(){
        System.out.print("bean加載完成。。");
    }
    // @Bean注解注册bean,同时可以指定初始化和销毁方法
    // @Bean(name="testBean",initMethod="start",destroyMethod="cleanUp")

    @Bean(initMethod = "start",destroyMethod = "cleanUp")
    @Scope("prototype")
    public TestBean testBean() {
        return new TestBean();
    }
}
