package com.almaaz.displayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class DisplayService1Application {

	public static void main(String[] args) {
		SpringApplication.run(DisplayService1Application.class, args);
	}

}
