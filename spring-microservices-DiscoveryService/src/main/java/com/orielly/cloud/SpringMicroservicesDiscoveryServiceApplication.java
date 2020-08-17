package com.orielly.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;


@SpringBootApplication
@EnableEurekaServer

public class SpringMicroservicesDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroservicesDiscoveryServiceApplication.class, args);
	}

}
