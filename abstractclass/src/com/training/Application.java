package com.training;
import com.training.model.HealthInsurance;
import com.training.model.Insurance;
import com.training.model.LifeInsurance;
import com.training.model.VehicleInsurance;

public class Application {
	
	public static void printPremium(Insurance object) {
		System.out.println("Premium:="+object.calculatePremium());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       VehicleInsurance bike = new VehicleInsurance(1010,"ramesh","bike",2019);
       printPremium(bike);
    
	   LifeInsurance life= new LifeInsurance(45,"nand",56);
	   printPremium(life);
	   
	   String[] illness= {"ent","thyroid"};
	   HealthInsurance health= new HealthInsurance(3030,"Vicky",illness);
	printPremium(health);
	

}
}