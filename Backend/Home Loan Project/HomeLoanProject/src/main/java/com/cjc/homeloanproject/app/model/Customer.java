package com.cjc.homeloanproject.app.model;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer
{
	@Id
	private Integer customerId;
	private String customerFname;
	private String customerMname; 
	private String customerLname;
//	private String dateofBirth;
//	private Integer customerAge;
//	private String customerGender;
//	private String customerEmail;
//	private String customerMobNo;
//	private Double customerAmountPaidForHome;
//	private Double LoanRequired;
//	private boolean previousLoan;
	
	
	//@OneToOne(cascade=CascadeType.ALL)
	//private AllPersonDocument apd;
	
	

}
