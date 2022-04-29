package com.example.jdbc_with_maven;
import com.example.entity.*;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

import com.example.dao.MemberRepository;
import com.example.demo.services.ProductService;
import com.example.util.ConnectionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void member() {
		
	}
	public static void product() {
		Connection con=ConnectionFactory.getPostgressConnection();
		//Connection con=ConnectionFactory.getOracleConnection();
	    ProductService service=new ProductService(con);
	   // ProductService service=new ProductService(con);
		Product toAdd = new Product(20,"dongle",45000.00);
		
		service.findAll().forEach(System.out::println);
		int rowAdded = service.addProduct(toAdd);
		System.out.println("Row Added:" +rowAdded );
		
	}
    public static void main(String[] args )
    {
    	//product();
    	//Connection con=ConnectionFactory.getOracleConnection();
    	//ProductService service=new ProductService(con);
      Connection con;
        try {
      	con=DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
      	con=ConnectionFactory.getOracleConnection();
       	System.out.println(con);
//        	
//         	con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Test","postgres","root");
//        	con=ConnectionFactory.getPostgressConnection();
//        	System.out.println(con);
//        	
//        	MemberRepository mem=new MemberRepository(con);
//        	Member toAdd=new Member(3,"bal","chennai",Date,"lifetime",5600,3,45);
//        	int rowAdded=mem.add(toAdd);
//        	//System.out.println("Row Added:" +rowAdded );
//        
//        	//LocalDate date2=sqlDate.toLocalDate();
//        	//mem.findAll().forEach(System.out::println);
//        	//System.out.println();
   }catch(Exception e) {
      	e.printStackTrace();
       }
   }
}
