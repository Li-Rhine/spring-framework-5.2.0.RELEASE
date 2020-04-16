package com.imooc.controller;

import com.imooc.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class WelcomeController {

	@Autowired
	private WelcomeService welcomeService;

	public void handleRequest() {
		welcomeService.sayHello("来自Controller的问候");

	}
}
