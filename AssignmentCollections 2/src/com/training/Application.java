package com.training;

import com.training.model.Product;

public class Application {

	
	public static void main(String[] args) {
		Product productval1=new Product(200,"foundation",500);
		Product productval2=new Product(201,"Compact",1500);
		Product productval3=new Product(202,"LipStick",2500);
		System.out.println(productval1.getProductId());
	}
}
