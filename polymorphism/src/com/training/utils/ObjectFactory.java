package com.training.utils;

import com.training.ifaces.Conditional;
import com.training.model.Student;
import com.training.model.Professor;

public class ObjectFactory {

	public Conditional getConditional(int key) {
		switch(key) {
		case 1:
			return new Professor("phd");	
		case 2:
			return new Student(89);
		default:
				return null;
		
	}
}
	
	public double getValue(Conditional obj,Object value) {
		boolean result=obj.test(value);
		double travelAllowance=1000;
		if(result) {
			travelAllowance=2000;
		}
		return travelAllowance;
	}
}