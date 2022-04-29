package com.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.training.model.CustomerService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Connection con;
   try {
    	con=DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
      	con=ConnectionFactory.getOracleConnection();
      	System.out.println(con);
      	
      	CustomerService service=new CustomerService(con);
      	service.findAll().forEach(System.out::println);
      	
    }catch(SQLException e) {
    	e.printStackTrace();
    }
}
}
