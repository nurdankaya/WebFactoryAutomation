package com.iuc.virtualFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan("com.iuc")
public class VirtualFactoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(VirtualFactoryApplication.class, args);
	}

}
