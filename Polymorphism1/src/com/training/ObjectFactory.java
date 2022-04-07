package com.training;


public class ObjectFactory {           
	 public Automobiles getObject(int key){
		 switch(key) {
		 case 1:
			 return new MarutiCar();
			 
		 case 2:
			 return new ToyotoCar();
		 default:
				return null;

		 }
		 
	 }
	 public void printQuote(Automobiles poly){
		 
		 if(poly!=null) {
			 System.out.println("color :="+poly.getColor());
			 System.out.println("Model :="+poly.getModel());
			 System.out.println("Price:="+poly.getPrice());
		 }else {
			 System.out.println("invalid choice enter 1 or 2");
		 }
		
	 }

}