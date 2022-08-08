package com.example.demo.utils.bidirection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.bidirectional.Doctor;
import com.example.demo.entity.bidirectional.Patient;
import com.example.demo.ifaces.bidirection.DoctorRepository;
import com.example.demo.ifaces.bidirection.PatientRepository;


@Component
public class Utility {
	
	
	@Autowired
	List<Patient> patientList;
	
	@Autowired
	Doctor doc;
	
	@Autowired
	DoctorRepository repos;
	
	@Autowired
	PatientRepository patientRepo;
	
public void create() {
	for(Patient eachPatient : patientList) {
		eachPatient.setDoctor(doc);
		patientRepo.save(eachPatient);
	}
    	
    	doc.setPatientList(patientList);
    	Doctor added=repos.save(doc);
    	if(added!=null) {
    		
    		System.out.println("One record is added");
    	}
    	
    	
    }
    
    public void findAll() {
    	
    	List<Doctor> doctors=repos.findAll();
    	
    	for(Doctor eachDoctor:doctors) {
    		
    		System.out.println("Doctor Name:"+eachDoctor.getDoctorName());
    		System.out.println("Department:"+eachDoctor.getDepartment());
    		
    		List<Patient> patients=eachDoctor.getPatientList();
    		
    		for(Patient eachPatient:patients) {
    			
    			System.out.println("Patient Name:"+eachPatient.getPatientName());
    			System.out.println("Mobile Number:"+eachPatient.getMobileNumber());
    		}
    	}
    }
	
	public void findDoctorFrmPatient() {
		
		Patient entity = patientRepo.findById(201).get();
		
		System.out.println(entity.getPatientName());
		
		System.out.println(entity.getDoctor());
	}
}
