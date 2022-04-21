package com.training.services;

import com.training.ifaces.AgeCondition;
import com.training.ifaces.Conditional;

public class StudentResultServices implements Conditional<Double> , AgeCondition<Double> {

	@Override
	public boolean test(Double t) {
		return t>80;
	}

	@Override
	public boolean negate(Double value) {
		//completely overriding super type with custom type
		if(value>100) {
			return true;
		}else {
			return false;
		}
//		boolean result1=Conditional.super.negate(value);// calling one of the super type
//		return result1;
//		boolean result2=Conditional.super.negate(value);// calling both the super type
//		return result2;
//		if(result1 && result2) {
//			return true;
//		}else {
//				return false;
//			}
//		
//		
		// TODO Auto-generated method stub
		//return Conditional.super.negate(value);
	}


}
