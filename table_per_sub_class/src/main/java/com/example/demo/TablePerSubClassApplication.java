package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.HealthInsurance;
import com.example.demo.entity.LifeInsurance;
import com.example.demo.services.InsuranceService;

@SpringBootApplication
public class TablePerSubClassApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx=	SpringApplication.run(TablePerSubClassApplication.class, args);
	InsuranceService service=ctx.getBean(InsuranceService.class);
	
	//service.addHealthPolicy();
	service.addLifePolicy();
	
	ctx.close();
	}
	
@Bean
public LifeInsurance life() {
	return new LifeInsurance(123,"abc",23,"it services");
}

@Bean
public HealthInsurance health() {
	return new HealthInsurance(2445,"archu",56,"diabetic");
}

}
