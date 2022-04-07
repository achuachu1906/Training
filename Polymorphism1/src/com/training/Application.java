package com.training;
import com.training.Automobiles;

public class Application {

	public static void main(String[] args) {
		ObjectFactory obj =new ObjectFactory();
		Automobiles marutiCar = obj.getObject(1);
		Automobiles toyotoCar = obj.getObject(2);
		
		System.out.println(Automobiles.SHOWROOM);
        obj.printQuote(marutiCar);
        obj.printQuote(toyotoCar);

	}

}
