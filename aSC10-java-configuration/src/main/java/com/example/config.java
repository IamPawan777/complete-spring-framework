package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.example")
public class config {
	@Bean("obj")
	public Pawan getDat() {
		return new Pawan();
	}
	
	// connect by @autowired
	@Bean
	public Address add1() {
		return new Address("London","England");
	}	
	@Bean
	@Primary
	public Address add2() {
		return new Address("Delhi", "India");
	}
	

}
