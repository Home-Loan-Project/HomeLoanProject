package com.cjc.homeloanproject.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cjc.homeloanproject.app.model.AccountDetails;
import com.cjc.homeloanproject.app.model.LoanDisbusment;
import com.cjc.homeloanproject.app.service.HomeLoanServiceI;

public class AccountDetailsController 
{
	@Autowired
	HomeLoanServiceI hsi;
	
	@GetMapping(value ="/getAccount")
	public ResponseEntity<List<AccountDetails>> getAccountDetails()
	{
		List<AccountDetails> list=hsi.getAccountDetails();
		 return new ResponseEntity<List<AccountDetails>>(list,HttpStatus.OK);
		
	}

	@PostMapping(value ="/account")
	public ResponseEntity<AccountDetails> saveAccountDetails(@RequestBody AccountDetails ad)
	{
		AccountDetails account =hsi.saveAccountDetails(ad);
		return new ResponseEntity<AccountDetails>(account,HttpStatus.CREATED);
	}
	
	@PutMapping(value ="/updatedetails/{accountId}")
	public ResponseEntity<AccountDetails> updateAccountDetails(@PathVariable Integer accountId ,@RequestBody AccountDetails ad)
	{
		AccountDetails details = hsi.updateAccountDetails(accountId,ad);
        
		return new ResponseEntity<AccountDetails>(details,HttpStatus.OK);
	}
	
	@DeleteMapping(value ="/account/{accountId}")
	public ResponseEntity deleteAccountDetails(@PathVariable Integer accountId )
	{ 
		hsi.deleteAccountDetails(accountId);
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
	
	
}
