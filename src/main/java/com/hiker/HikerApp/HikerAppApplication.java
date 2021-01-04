package com.hiker.HikerApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class HikerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HikerAppApplication.class, args);
	}

}
