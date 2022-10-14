package com.cjc.homeloanproject.app.model;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnquieryDetail {
	
	@Id
	private Integer cID;
	private String firstName;
	private String lastName;
	private Integer age;
	private String email;
	private Double mobileNo;
	private Double pancardNo;
		

}
