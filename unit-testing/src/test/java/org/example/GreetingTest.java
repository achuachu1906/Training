package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.Greeting;

public class GreetingTest {
	
	
	@Test
	@DisplayName(value="Test the Get Message return a string of Length 8 characters")
	void testMaxLength() {
		Greeting grtObj = new Greeting();
		int actual =grtObj.getMessage().length();
		int expected= 5;
		assertEquals(expected,actual);
		}
	
	@Test
	@DisplayName(value="Test the Birthday Wish method does not return null")
	void testBirthdayWish() {
		Greeting grtObj = new Greeting();
		
		String actual=grtObj.birthdayWish("ramesh");
		assertNotNull(actual);
	}
	
	@Test
	@DisplayName("Test the Birthday Wish method sholud return Happy Birthday with user name suffixed")
	void  testBirthdayWishWithUserName() {
		Greeting grtObj=new Greeting();
		String name="achu";
		String actual=grtObj.birthdayWishWithUserName(name);
		String expected="Happy Birthday"+name;
		
		
		assertEquals(expected,actual);
		
		
	}

}
