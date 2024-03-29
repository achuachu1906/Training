package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="archudoctor_one_To_Many")


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
	
	@Id
	@Column(name="doctor_id")
	int doctorId;
	
	@Column(name="doctor_name")
	String doctorName;
	
	@Column(name="department")
	String department;
	
	@Column(name="phone_number")
	long phoneNumber;
	
	@OneToMany(targetEntity=Patient.class, fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="doctor_ref",referencedColumnName="doctor_id")
	List<Patient> patientList;      //one to many (one doctor has many patients)

}
