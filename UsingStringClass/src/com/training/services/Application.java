package com.training.services;

public class Application {

	public static void main(String[] args) {
		StringService service = new StringService();
	
	   int key=14;
	   switch (key) {
	   case 1:
		  service.stringEquals("ram","ram"); 
		  break;
	   case 2:
		   service.stringObjectEquals();
	   break;
      
       case 3:
    	   service.usingTrim("  ramesh  ");
    	   break;
       case 4:
    	   service.lengthOfString("  ramesh  ");
    	   break;
       case 5:
    	   service.usingSubString("archan");
    	   break;
       case 6:
    	   service.usingCharAtAndIndexOf("ram@abc.com");
    	   break;
       case 7:
    	   service.usingReplace("ram@abc", "Welcome to chennai");
    	   break;
       case 8:
    	   service.usingConcat("hello", "chennai");
    	   break;
       case 9:
    	   service.usingCompareTo("Ram", "Ra");
    	   break;
       case 10:
    	   service.usingStringFormat("ram", 45.298);
    	   break;
       case 11:
    	   service.usingStringFormat(17);
    	   break;
       case 12:
    	   service.usingStringFormat(16,16);
    	   break;
       case 13:
    	   service.usingStringFormat("ram","ram");
    	   break;
       case 14:
    	   service.usingStringFormat(-421L);
    	   break;
    	   
   
    		   
    	   default:
    		   break;
	   }
	}

}
