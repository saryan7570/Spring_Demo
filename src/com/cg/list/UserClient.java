package com.cg.list;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan("com.cg.list")
@EnableAutoConfiguration
@PropertySource("classpath:/user.properties")
public class UserClient {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("user.xml");
		
		ApplicationContext applicationContext = SpringApplication.run(UserClient.class, args);
		User user = (User) applicationContext.getBean("user");
		System.out.println(user.getUserName());
		System.out.println(user.getPassword());
	}
}