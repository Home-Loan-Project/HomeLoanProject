package com.cjc.homeloanproject.app.model;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDetails {
	
	@Id
	private Integer accountId;
	private String accountType;
//	private Double accountBalance;
//	private String accountHolderName;
//	private String accountNo;
//	
	

}
