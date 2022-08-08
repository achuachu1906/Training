package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		
		
	    ConfigurableApplicationContext	 ctx = SpringApplication.run(SpringJdbcApplication.class, args);
		ProductRepository repo = ctx.getBean(ProductRepository.class);
		//repo.findAll().forEach(System.out::println);
		
		//Product tong = ctx.getBean(Product.class);
		//System.out.println("Row Added :"+repo.add(tong));
		//repo.findAll().forEach(System.out::println);
		System.out.println("remove:"+repo.remove(60));
		//System.out.println("findByid:"+repo.findById(4));
		
		
//		Product t=ctx.getBean(Product.class);
//		System.out.println("Update:"+repo.update(t));
		ctx.close();
			
		}
//	@Bean
//
//	public Product tong() {
//		return new Product(15, "Tong", 990);
//	}
	
	@Bean
	@Primary
	
	public Product t() {
		return new Product(1, "physics", 290);
		}
	}
