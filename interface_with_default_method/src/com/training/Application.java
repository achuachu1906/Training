package com.training;

import com.training.ifaces.Conditional;
import com.training.services.StudentResultServices;

public class Application {

	public static void main(String[] args) {
		StudentResultServices service=new StudentResultServices();
		System.out.println("Is pass :" + service.test(90.00));
		System.out.println("Is fail:" + service.negate(90.00));
		System.out.println(Conditional.getMessage());
	}

}
