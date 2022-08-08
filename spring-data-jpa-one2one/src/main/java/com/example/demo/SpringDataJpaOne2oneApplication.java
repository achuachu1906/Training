package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


import com.example.demo.entity.Seminar;
import com.example.demo.entity.Speaker;
import com.example.demo.ifaces.SeminarRepository;


@SpringBootApplication
public class SpringDataJpaOne2oneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringDataJpaOne2oneApplication.class, args);
		
		Seminar sem=ctx.getBean(Seminar.class);
		SeminarRepository obj=ctx.getBean(SeminarRepository.class);
		obj.findAll().forEach(System.out::println);
		
	
		
//	Seminar added=obj.save(sem);
//		
//		if(added!=null) {
//			System.out.println("One Record Added");
//		}
		ctx.close();
	}

	@Bean
	public Seminar chan() {
		return new Seminar(1,"technical",1,shin());
	}
	
	
	@Bean
	public Speaker shin() {
		return new Speaker(1,"abi","B.tech");
	}
	

}
