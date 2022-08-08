package org.example;

import static org.hamcrest.MatcherAssert.assertThat;
import org.example.services.ProductService;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProductServiceTest {
	
	ProductService service =null;
	@BeforeEach
	void init() {
		service=new ProductService();
	}
	
	@DisplayName(value="Test findDiscount method return 0.20 or above for tv and laptop")
	@Test
	void testFindDiscountCaseOne() {
		double actual= service.findDiscount("tv");
		assertThat(actual, is(greaterThan(0.19)));
	}

	@DisplayName(value="Test findDiscount method return 0.10 or above for fridge,washingmachine")
	@Test
	void testFindDiscountCaseTwo() {
		double actual= service.findDiscount("tv");
		assertThat(actual, is(greaterThan(0.19)));
	}
	
	@DisplayName(value="Test findProducts method returns a list of four brands")
    @Test
	void testFindProductCaseOne() {
		
	     String[] actual=service.findProducts();
	     assertThat(actual, arrayWithSize(4));

	
	}

	@DisplayName(value="Test findProducts method return a list containing" 
	+ "Dell,Lenovo,Hp,Asus for product laptop")
	@Test
	void testFindProductCaseTwo() {

		String[] actual=service.findProducts();
	   assertThat(actual, is(arrayContaining("Dell","Lenovo","Hp","Asus")));

	
	}
	
}
