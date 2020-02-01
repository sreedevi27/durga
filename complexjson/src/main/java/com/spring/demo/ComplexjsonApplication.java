package com.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.spring.demo")
@EntityScan("com.spring.demo.entity")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ComplexjsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComplexjsonApplication.class, args);
	}

}
