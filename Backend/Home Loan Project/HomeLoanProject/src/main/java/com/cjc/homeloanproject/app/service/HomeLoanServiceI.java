package com.cjc.homeloanproject.app.service;

import java.util.List;

import com.cjc.homeloanproject.app.model.AccountDetails;
import com.cjc.homeloanproject.app.model.Address;
import com.cjc.homeloanproject.app.model.AllPersonDocument;
import com.cjc.homeloanproject.app.model.Customer;
import com.cjc.homeloanproject.app.model.Guarantor;
import com.cjc.homeloanproject.app.model.LoanDisbusment;

public interface HomeLoanServiceI {

	public List<Customer> getCustomer();

	

	public Customer PostCustomer(Customer c);
	public Customer updateCustomer(int id, Customer p);



	public void delete(int customerId);
	public List<AllPersonDocument> saveDocument(AllPersonDocument document);
	public List<Guarantor> getGuranter();



	public Guarantor saveGauranter(Guarantor p);
	public void deleteGuranter(Integer guranterId);



	public Guarantor updateGuarantor(Integer guranterId, Guarantor p);



	public List<Guarantor> saveAllDocument(Guarantor document);

//////////Address////

	public Address PostCustomer(Address a);


	
	///////////Disburstment//////////////////

	public List<LoanDisbusment> getLoanDisburst();



	public LoanDisbusment saveLoanDisburst(LoanDisbusment ld);



	public LoanDisbusment updateLoanDisburstment(Integer agreementId, LoanDisbusment ld);



	public void deleteLoanDisburst(Integer agreementId);


	///////////////////Account Details/////////////////

	public List<AccountDetails> getAccountDetails();



	public AccountDetails saveAccountDetails(AccountDetails ad);



	public AccountDetails updateAccountDetails(Integer accountId, AccountDetails ad);



	public void deleteAccountDetails(Integer accountId);



	



}
