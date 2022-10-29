package com.springboothtml.springboothtml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.springboothtml.springboothtml")
public class SpringboothtmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringboothtmlApplication.class, args);
	}

}
