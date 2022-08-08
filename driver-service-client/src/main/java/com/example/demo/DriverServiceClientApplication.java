package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Driver;

@SpringBootApplication
public class DriverServiceClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(DriverServiceClientApplication.class, args);
		
		Client client=ctx.getBean(Client.class);
		System.out.println(client.invokeGetAll());
//		
//		Driver[] list = client.invokeAllAsObject();
//		for(Driver eachDriver:list) {
//			System.out.println("driver name :"+eachDriver.getDriverName());
//			System.out.println("mobile number :"+eachDriver.getMobileNumber());
//			System.out.println("rating :"+eachDriver.getRating());
//			System.out.println("driver id :"+eachDriver.getDriverID());
		ctx.close();
	}
	
@Bean
public BasicAuthenticationInterceptor interceptor() {
	
	
	return  new BasicAuthenticationInterceptor("india","India");
}


@Bean

public RestTemplate template() {
	
	RestTemplate template = new RestTemplate();
	
	template.getInterceptors().add(interceptor());
	return  template;
	
	
}
}
