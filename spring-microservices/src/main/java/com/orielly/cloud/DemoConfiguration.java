package com.orielly.cloud;

 
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;

public class DemoConfiguration {
	
	@Bean
	public List<String> language(){
		return Arrays.asList("Java","Python");
	}

}
