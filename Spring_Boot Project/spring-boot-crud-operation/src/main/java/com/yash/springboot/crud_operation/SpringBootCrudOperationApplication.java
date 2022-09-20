package com.yash.springboot.crud_operation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
@SpringBootApplication
public class SpringBootCrudOperationApplication {

	public static void main(String[] args) {
		System.out.println("Hello World");
		SpringApplication.run(SpringBootCrudOperationApplication.class, args);
	}
	

}
