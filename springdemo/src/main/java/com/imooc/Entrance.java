package com.imooc;

import com.imooc.service.WelcomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Entrance {
	public static void main(String[] args) {
		System.out.println("Hello World");

		String xmlPath = "D:\\WorkCode\\spring-framework-5.2.0.RELEASE\\springdemo\\src\\main\\resources\\spring\\spring-config.xml";
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(xmlPath);
		WelcomeService welcomeService = (WelcomeService) applicationContext.getBean("welcomeService");
		welcomeService.sayHello("强大的spring框架");
	}
}
