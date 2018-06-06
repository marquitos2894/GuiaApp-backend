package com.conmiciv;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.conmiciv")
@SpringBootApplication
public class GuiaAppBackendApplication {

	

	public static void main(String[] args) {
		SpringApplication.run(GuiaAppBackendApplication.class, args);
	}
}
