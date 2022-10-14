package com.cjc.homeloanproject.app.model;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EligibilityCriteria 
{
	@Id
	private Double netMonthlyIncome;
	private Double rateOfIntrest;
	private Double enureOfHousingLoan;
	
	//status

	

}
