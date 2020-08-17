package com.orielly.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableSidecar
public class SpringMicroservicesSideCarServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroservicesSideCarServiceApplication.class, args);
	}

}
