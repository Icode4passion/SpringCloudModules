package org.com.mvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ComponentScan("org.com.mvc.controllers")
public class WebConfig {

}
