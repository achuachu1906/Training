package com.training.model;

import java.util.logging.Logger;

public class LoggingWithPropFile {

	public static void main(String[] args) {
		
		String file=LoggingWithPropFile.class.getClassLoader().getResource("logging.properties").getFile();
		System.setProperty("java.util.logging.config.file",file);
		System.out.println(file);
		
		Book.Log.info("Logging Properties Done Right");
		Book java=new Book();
		Logger log=Logger.getLogger("com.example");
		Book.log.info(java.toString());
		
		
	}catch(SecurityException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}

}
