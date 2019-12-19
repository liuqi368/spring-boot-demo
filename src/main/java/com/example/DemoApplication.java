package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@EnableAutoConfiguration
@MapperScan({"com.example.dao"})
public class DemoApplication extends SpringBootServletInitializer{

	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
// 注意这里要指向原先用main方法执行的Application启动类
		return builder.sources(DemoApplication.class);
	}*/
	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

	}

}
