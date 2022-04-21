package com.example;
import java.io.IOException;
import java.util.logging.*;

public class LogToFile {

	public static void main(String[] args) {
		Logger log=Logger.getLogger(LogToFile.class.getName());
		
		FileHandler handler;
		try {
			handler = new FileHandler("logs.log");
			log.addHandler(handler);
			throw new RuntimeException("k is a great programmer");
			//log.info("Try Block Called");
		} catch (SecurityException e) {
			log.warning(e.getMessage());
			
		} catch (Exception e) {
			log.warning(e.getMessage());
		}
		
	}

}
