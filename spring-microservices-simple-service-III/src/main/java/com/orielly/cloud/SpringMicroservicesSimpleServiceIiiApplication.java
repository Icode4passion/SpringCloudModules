package com.orielly.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringMicroservicesSimpleServiceIiiApplication {
	
	@RequestMapping("/execute")
	public String execute() {
		return "Executed ..";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroservicesSimpleServiceIiiApplication.class, args);
	}

}
