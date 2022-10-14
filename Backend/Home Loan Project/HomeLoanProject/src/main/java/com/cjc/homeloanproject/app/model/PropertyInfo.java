package com.cjc.homeloanproject.app.model;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropertyInfo 
{
	@Id
	private Integer propertyId;	
	private String propertyType;
	private Double propertyPrice;		
	private byte[] propertyDocuments;
	private byte[] priceProof;
	

}
