package com.training.model;

import com.training.ifaces.Conditional;

public class Application {

	public static void main(String[] args) {
		NewObjectFactory factory=new NewObjectFactory();
		
		Conditional profObj=factory.getConditional(1);
		Conditional studObj=factory.getConditional(2);
		
		System.out.println("Allowance:="+factory.getValue(profObj, "chennai"));
		System.out.println("Allowance:="+factory.getValue(studObj, "90"));
     
		Conditional principalObj=factory.getConditional(3);
		System.out.println("Allowance:="+factory.getValue(principalObj, "engg"));
	}

}
