package com.training.model;
import com.training.model.Doctor;
import com.training.model.Patient;

import java.util.Map;
import java.util.Set;

public class Appointment {
	private Map<Doctor,Set<Patient>>Pat;

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment(Map<Doctor, Set<Patient>> pat) {
		super();
		Pat = pat;
	}

	public Map<Doctor, Set<Patient>> getPat() {
		return Pat;
	}

	public void setPat(Map<Doctor, Set<Patient>> pat) {
		Pat = pat;
	}

	@Override
	public String toString() {
		return "Appointment [Pat=" + Pat + "]";
	}
	

	public Set<Patient>getPatients(Doctor key){
		return this.Pat.get(key);
	}
	
	

	
	
	
}
