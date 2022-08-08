package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.example.demo.entity.Doctor;
import com.example.demo.services.DoctorServices;

@SpringBootApplication
public class SpringDataJpsSimpleMappingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringDataJpsSimpleMappingApplication.class, args);
		Doctor archu=ctx.getBean(Doctor.class);
		DoctorServices service=ctx.getBean(DoctorServices.class);
		service.findAll().forEach(System.out::println);
		System.out.println("***********************");
		service.findByDept("cardio").forEach(System.out::println);
		System.out.println("*************************");
		service.findByNameAndDepartment("chan", "ent").forEach(System.out::println);
		System.out.println("*******************************");
		service.findByNameOrDepartment("chan", "cardio").forEach(System.out::println);
		
	
		
//		Doctor added=service.add(archu);
//		
//		if(added!=null) {
//			System.out.println("One Doctor Added");
//		}
//		
		ctx.close();
	
	}
	@Bean
	public Doctor archu() {
		return new Doctor(2020,"archu","cardio",99448);
	}
	@Bean
	public Doctor chan() {
		return new Doctor(2021,"chan","ent",91091);
	}
	@Bean
	@Primary
	public Doctor archuchan() {
		return new Doctor(2022,"archuchan","ent",91091);
	}


}
