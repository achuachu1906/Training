package com.example.demo.entity.bidirectional;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "archus_patient_otm_bid")
@Getter
@Setter
@Data
@NoArgsConstructor


public class Patient {

	@Id
	@Column(name="patient_id")
	int patientId;
	
	@Column(name="patient_name")
	String patientName;
	
	
	@Column(name="mobile_number")
	long mobileNumber;
	
	@ManyToOne(fetch = FetchType.EAGER)
	 @JoinColumn(name = "doctor_ref")
	
	
	
	private  Doctor doctor;

	public Patient(int patientId, String patientName, long mobileNumber, Doctor doctor) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.mobileNumber = mobileNumber;
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", mobileNumber=" + mobileNumber
				+ ", doctor=" + doctor + "]";
	}

	
	
}
	