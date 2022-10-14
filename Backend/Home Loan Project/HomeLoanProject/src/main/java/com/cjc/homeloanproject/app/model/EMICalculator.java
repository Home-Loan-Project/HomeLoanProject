package com.cjc.homeloanproject.app.model;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EMICalculator
{
	@Id
	private Double tenure;
	private Double rateOfIntrest;
	private Double totalAmount;
}
