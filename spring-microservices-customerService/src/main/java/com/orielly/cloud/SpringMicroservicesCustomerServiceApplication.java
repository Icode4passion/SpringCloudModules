package com.orielly.cloud;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class SpringMicroservicesCustomerServiceApplication {
	
	private List<Customer> customer = Arrays.asList(
			new Customer(1,"Ram"),
			new Customer(2,"Lakshman")
			);
	
	@GetMapping
	public List<Customer> getAllCustomers(){
		return customer;
	}
	
	@GetMapping("/{id}")
	public  Customer getCustomerId(@PathVariable int id){
		return customer.stream()
					.filter(customer -> customer.getId()==id)
					.findFirst()
					.orElseThrow(IllegalArgumentException::new);
	}
	
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMicroservicesCustomerServiceApplication.class, args);
	}

}
