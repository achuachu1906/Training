package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.example.demo.entity.Employee;
import com.example.demo.services.EmployeeServices;

@SpringBootApplication
public class TaskWithJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(TaskWithJpaApplication.class, args);
		Employee archu=ctx.getBean(Employee.class);
		EmployeeServices service=ctx.getBean(EmployeeServices.class);
		System.out.println("*********************************");
		service.findAll().forEach(System.out::println);
		System.out.println("*******************");
		service.findById(103).forEach(System.out::println);
		
		service.findByLocAndSkill("vellore", "sleeping").forEach(System.out::println);

		System.out.println("find by location and skillSet");
		service.findByLocAndSkill("tirupur", "sql").forEach(System.out::println);
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		service.findBySkillSet("html").forEach(System.out::println);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		service.findByLocation("vellore").forEach(System.out::println);
		System.out.println("******************************************");
	    System.out.println(	service.findByDob(LocalDate.of(2001, 06, 19)));
	    System.out.println("*******************************************");
	    service.findByLocOrSkill("vellore", "sql").forEach(System.out::println);
	
	Employee added=service.add(archu);
		
//		if(added!=null) {
//			System.out.println("One Employee Added");
//		}
//		
		ctx.close();
	
	}
	@Bean
	public Employee archu() {
		return new Employee(101,"archu","vellore",LocalDate.of(2001, 06, 19),"sleeping",99448);
	}
	@Bean
    public Employee navi() {
		return new Employee(102,"navi","bangalore",LocalDate.of(1999, 03,9),"java",78976);
	}
	@Bean
	
	public Employee nithi() {
		return new Employee(103,"nithi","chennai",LocalDate.of(2005, 01,7),"html",789756);
	}
	@Bean
	@Primary
	public Employee sandy() {
		return new Employee(104,"sandy","tirupur",LocalDate.of(2005, 01,7),"sql",789756);
	}
	

}



