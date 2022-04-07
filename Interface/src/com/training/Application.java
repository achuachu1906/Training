package com.training;
import com.training.ifaces.CheckCondition;
import com.training.ifaces.Conditional;
import com.training.ifaces.Function;
import com.training.services.CurrencyConvertor;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//subtype=new subtype
		Function conv= new CurrencyConvertor();
		double response= conv.apply(200);
		System.out.println(Function.COUNTER);
		System.out.println(response);
       //line13 and 15  and  line 18 are identical
		System.out.println(conv.apply(300));
		
		if(conv instanceof CheckCondition) {
			CheckCondition obj= (CheckCondition)conv;
			System.out.println("Is Discount Allowed:="+obj.test(300));
		}else {
			System.out.println("Cannot be cast");
		}
		
		Conditional condObj = new DiscountCalculator();
	      System.out.println(condObj.test(6000));
	      System.out.println(condObj.negate(6000));
	      
	}
     
      
}
