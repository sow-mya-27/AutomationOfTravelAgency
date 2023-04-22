package com.example.automationOfTravelAgency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.example.automationOfTravelAgency.entity"})
@ComponentScan
public class AutomationOfTravelAgencyApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutomationOfTravelAgencyApplication.class, args);
	}

}
