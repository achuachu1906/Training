package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.bidirectional.Doctor;
import com.example.demo.entity.bidirectional.Patient;
import com.example.demo.utils.bidirection.Utility;

@SpringBootApplication
public class SpringDataJpaOne2manyBidApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=
				SpringApplication.run(SpringDataJpaOne2manyBidApplication.class, args);
		 Utility obj = ctx.getBean(Utility.class);
		 obj.findDoctorFrmPatient();
         //obj.create();
        // obj.findAll();
		 
		 ctx.close();
		 }
	@Bean
        public Doctor abi() {
		
		Doctor doc= new Doctor();
		doc.setDoctorId(101);
		doc.setDoctorName("abi");
		doc.setDepartment("ortho");
		doc.setPhoneNumber(9456439);
		return doc;
	}
	
	@Bean
	public Patient thas() {
		return new Patient(200,"thas",9443821,abi());
	}
	
	@Bean
	public Patient thas1() {
		return new Patient(201,"thas1",94435768,abi());
	}
	
	@Bean
	public Patient thas2() {
		return new Patient(202,"thas2",94435768,abi());
	}
	
	}


