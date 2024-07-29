package com.aec.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.aec.training","com.aec.training.entity","com.aec.training.repository","com.aec.training.service"})
//@EntityScan("com.aec.training.entity")
public class AecSpringBootMvcTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(AecSpringBootMvcTrainingApplication.class, args);
	}

}
