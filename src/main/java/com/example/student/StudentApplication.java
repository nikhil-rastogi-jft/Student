package com.example.student;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentApplication {
	@Bean
	public ModelMapper getMapper(){
		return new ModelMapper();
	}
	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}

}
