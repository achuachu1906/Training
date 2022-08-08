package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Primary;
import org.training.model.Author;
import org.training.model.Book;

import com.example.demo.model.Bill;
import com.example.demo.model.Invoice;
import com.example.demo.model.Student;
import com.example.demo.model.Teacher;

@ComponentScan(basePackages = {"org.training", "com.example"})
@SpringBootApplication
public class SpringQuickStartApplication {	
		public static void trail() {	
			
			
//			//when using Id need to cast to specify bean since
//			//return type of getBean method is object
//			System.out.println(ctx.getBean("ram"));
//			
//			
////			Teacher stella = ctx.getBean(Teacher.class);		
////			stella.setId(500);
////			stella.setName("Stella Mary");
////			stella.setSubject("Thermo Dynamics");
////			System.out.println(stella);
	//	
//			
//			
//			//casting not required , but there should be only one bean of that type
//			//will throw exception
//			Teacher hari = (Teacher) ctx.getBean("hari",Teacher.class );
//			System.out.println(hari);
		}
		
			public static void main(String[] args) {		
		//ApplicationContext is IOC container is a parent of BeanFactory
		ApplicationContext ctx=SpringApplication.run(SpringQuickStartApplication.class, args);
		
		System.out.println((ctx.getBean(Book.class)));
		
		Invoice inv = ctx.getBean(Invoice.class);
		System.out.println(inv);
		//System.out.println(ctx.getBean("suresh"));
		
		Bill bill = ctx.getBean(Bill.class);
		System.out.println("Customer :"+bill.getCustomer());
		System.out.println("Product :"+bill.getProduct());
		
		CustomerList list = ctx.getBean(CustomerList.class);
		list.getCustList().forEach(System.out::println);
		System.out.println("Author :"+ctx.getBean(Author.class));
		System.out.println("Author :"+ctx.getBean("thashi" ,Author.class));
			}
		@Bean
		public Author thashi() {
			return new Author(100, "HeadFirstJava");
		
	}	
		
		@Bean
		@Primary
		public Author ashi() {
			return new Author(101, "FirstJava");
		
}
}		