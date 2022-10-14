package com.cjc.homeloanproject.app.model;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SanctionDetails {
	
	@Id
	private Integer sanctionId;
	private String sanctionDate;
	private String applicantName;
	private Double loanAmountSanction;
	private String interestType;
	private String rateOfInterest;
	private String loanTenure;
	private Double monthlyEMIAmt;
	
	
	

}
