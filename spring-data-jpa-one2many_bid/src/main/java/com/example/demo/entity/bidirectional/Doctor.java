package com.example.demo.entity.bidirectional;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="archus_doctor_otm_bid")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Doctor {
    @Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", department=" + department
				+ ", phoneNumber=" + phoneNumber + "]";
	}

	@Id
    @Column(name="Doctor_Id")
	int doctorId;
    
    @Column(name="Doctor_Name")
	String doctorName;
    
    @Column(name="Department")
	String department;
    
    @Column(name="Phone_Number")
	long phoneNumber;
    
    @OneToMany(mappedBy="doctor",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
    
  
    List<Patient> patientList;
	
}
