package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="achu__master_insurance")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="insurance_type",length=10,discriminatorType=DiscriminatorType.STRING)
public class Insurance {
	@Id
	@Column(name="policy_Number")
	private int policyNumber;
	
	@Column(name="policy_Holder_Name")
	private String policyHolderName;
	
	
	

}
