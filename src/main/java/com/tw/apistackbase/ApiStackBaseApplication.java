package com.tw.apistackbase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class ApiStackBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiStackBaseApplication.class, args);
	}
}
