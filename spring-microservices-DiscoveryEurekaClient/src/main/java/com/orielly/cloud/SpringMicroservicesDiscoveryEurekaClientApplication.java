package com.orielly.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringMicroservicesDiscoveryEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroservicesDiscoveryEurekaClientApplication.class, args);
	}

}
