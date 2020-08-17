package org.com.mvc.controllers;

import org.com.mvc.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/main")
public class MainController {
	
	@Autowired
	public GreetingService greetingService;
	
	
	@ResponseBody 
	@RequestMapping("/")
	public String message() {
		return this.greetingService.greet();
	}

}
