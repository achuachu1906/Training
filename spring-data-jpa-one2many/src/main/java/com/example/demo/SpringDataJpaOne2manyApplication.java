package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.utils.DoctorUtils;
import com.example.demo.utils.bidirection.Utility;

@SpringBootApplication
public class SpringDataJpaOne2manyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringDataJpaOne2manyApplication.class, args);
//	//	Utility obj=ctx.getBean(Utility.class);
//		obj.findAll();
//		obj.create();
		ctx.close();
		}
		@Bean
		public Doctor abi() {
			Doctor doc=new Doctor();
			doc.setDoctorId(4);
			doc.setDepartment("physio");
			doc.setDoctorName("abi");
			doc.setPhoneNumber(78965);
			return doc;
			
		}
		
		@Bean
		public Patient divi() {
			return new Patient(66,"divi",645830);
	}
		
		@Bean
		public Patient cibi() {
			return new Patient(67,"hari",645840);
	}


}
