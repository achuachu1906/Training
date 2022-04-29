package com.example.demo;
import java.sql.*;
import java.util.Optional;

import com.example.demo.services.ProductService;
import com.example.entity.Product;

public class Application {

	public static void main(String[] args) {
		Connection con;
		
				try {
					con=DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
					
				ProductService service=new ProductService(con);
				Product toAdd = new Product(26,"ups",1470.00);
					//int rowAdded = service.addProduct(toAdd);
					//System.out.println("Row Added:" +rowAdded );
					//service.findAll().forEach(System.out::println);
					
					int rowsUpdate=service.updatePriceByName("tv", 4500);
					System.out.println("rowsupdated:="+rowsUpdate);
					
				//	int rowDeleted= service.addProduct(toAdd);
					//System.out.println("Row Deleted:" +rowDeleted );
					service.findAll().forEach(System.out::println);
					
					Optional<Product> found = service.findById(22);
					if(found.isPresent()) {
						System.out.println(found.get());
					}else {
						System.out.println("Product with given id is not present");
					}
					
					
				
				} catch (SQLException e) {
					
					e.printStackTrace();
				}

	}

}
