package com.training.model;


import com.training.ifaces.Conditional;

public class Principal implements Conditional {
	private String typeOfCollege;
	
	public String getTypeOfCollege() {
		return typeOfCollege;
	}
   public void setTypeOfCollege(String typeOfCollege) {
		this.typeOfCollege = typeOfCollege;
	}
   public Principal() {
		super();
		// TODO Auto-generated constructor stub
	}
  public Principal(String typeOfCollege) {
		super();
		this.typeOfCollege = typeOfCollege;
	}
    @Override
	public boolean test(Object value) {
    	String typeOfCollege =(String)value;
    	boolean result=false;
    	if(typeOfCollege.equals("engg")) {
    		return true;
    }
		
		return result;
	}

}
