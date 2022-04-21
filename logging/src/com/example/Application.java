package com.example;
import java.util.logging.*;

public class Application {
	public static void main(String[]args) {
		
		Logger log=Logger.getLogger("com.example.Application");
		
		
		log.setLevel(Level.FINEST);
		log.info("Info Message");
		//System.out.println("Info Message");
		
		log.warning("Warning Message**************");
		log.severe("SEVERE MESSAGE********************");
		log.finest("I am FINE Message**********************");
				
	}

}
