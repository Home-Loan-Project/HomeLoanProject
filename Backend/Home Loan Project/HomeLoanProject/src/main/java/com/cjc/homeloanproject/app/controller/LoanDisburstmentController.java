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

import com.cjc.homeloanproject.app.model.Guarantor;
import com.cjc.homeloanproject.app.model.LoanDisbusment;
import com.cjc.homeloanproject.app.service.HomeLoanServiceI;

public class LoanDisburstmentController 
{

	@Autowired
	HomeLoanServiceI hsi;
	
	//getApi
	@GetMapping(value ="/getdisburst")
	public ResponseEntity<List<LoanDisbusment>> getLoanDisburst()
	{
		List<LoanDisbusment> list=hsi.getLoanDisburst();
		 return new ResponseEntity<List<LoanDisbusment>>(list,HttpStatus.OK);
		
	}
	
	@PostMapping(value ="/disburst")
	public ResponseEntity<LoanDisbusment> saveLoanDisburst(@RequestBody LoanDisbusment ld)
	{
		LoanDisbusment loandisburst =hsi.saveLoanDisburst(ld);
		return new ResponseEntity<LoanDisbusment>(loandisburst,HttpStatus.CREATED);
	}
	
	@PutMapping(value ="/updatedisburst/{agreementId}")
	public ResponseEntity<LoanDisbusment> updateLoanDisburstment(@PathVariable Integer agreementId ,@RequestBody LoanDisbusment ld)
	{
		LoanDisbusment loan = hsi.updateLoanDisburstment(agreementId,ld);
        
		return new ResponseEntity<LoanDisbusment>(loan,HttpStatus.OK);
	}
	
	@DeleteMapping(value ="/disburst/{agreementId}")
	public ResponseEntity deleteLoanDisburst(@PathVariable Integer agreementId )
	{ 
		hsi.deleteLoanDisburst(agreementId);
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
}
