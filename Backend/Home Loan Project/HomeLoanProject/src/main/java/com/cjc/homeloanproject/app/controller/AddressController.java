package com.cjc.homeloanproject.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.homeloanproject.app.model.Address;
import com.cjc.homeloanproject.app.model.Customer;
import com.cjc.homeloanproject.app.service.HomeLoanServiceI;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class AddressController {
	
	@Autowired
	HomeLoanServiceI hs;
	
	@PostMapping("/postAddress")
	public ResponseEntity<Address> postCustomerAddress(@RequestBody Address a)
	{
		if(a.getCustomerAddrId()==0)
		{
			return new ResponseEntity<Address>(HttpStatus.BAD_REQUEST);
		}
		
		Address cust=hs.PostCustomer(a);
		return new ResponseEntity<Address>(HttpStatus.CREATED);
	}

}