package com.cjc.homeloanproject.app.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cjc.homeloanproject.app.model.AccountDetails;
import com.cjc.homeloanproject.app.model.Address;
import com.cjc.homeloanproject.app.model.AllPersonDocument;
import com.cjc.homeloanproject.app.model.Customer;
import com.cjc.homeloanproject.app.model.Guarantor;
import com.cjc.homeloanproject.app.model.LoanDisbusment;
import com.cjc.homeloanproject.app.repository.AccountDetailsRepository;
import com.cjc.homeloanproject.app.repository.AddressRepository;
import com.cjc.homeloanproject.app.repository.AllPersonDocumentRepository;
import com.cjc.homeloanproject.app.repository.GurantorRepository;
import com.cjc.homeloanproject.app.repository.HomeLoanRepository;
import com.cjc.homeloanproject.app.repository.LoanDisbustmentRepository;
import com.cjc.homeloanproject.app.service.HomeLoanServiceI;
@Service
public class HomeLoanServiceImpl implements HomeLoanServiceI
{
	@Autowired
	HomeLoanRepository hlr;
	
	@Autowired
	AllPersonDocumentRepository apd;
	
	@Autowired
	GurantorRepository gr;
	
	@Autowired
	AddressRepository ar;
	
	@Autowired
	LoanDisbustmentRepository ldr;

	@Autowired
	AccountDetailsRepository adr;
	
	@Override
	public List<Customer> getCustomer()
	{
		List<Customer> list=hlr.findAll();
		
		return list;
	}

	@Override
	public Customer PostCustomer(Customer c)
	{
		Customer cust=hlr.save(c);
		return cust;
	}


	
	

	@Override
	public Customer updateCustomer(int customerId, Customer c) {
		Optional<Customer> op  = hlr.findById(customerId);
		 if(op.isPresent()) 
		 {
			 Customer cust= op.get();
			 cust.setCustomerFname(c.getCustomerFname());
			 cust.setCustomerMname(c.getCustomerMname());
			 cust.setCustomerLname(c.getCustomerLname());
			 
			 return   hlr.save(cust);
		 }
		 else
		 {
			 return null;
		 }
		
		
	}

	@Override
	public void delete(int customerId) {
		hlr.deleteById(customerId);
		
	}

	
		@Override
		public List<AllPersonDocument> saveDocument(AllPersonDocument doc)
		{
			apd.save(doc);
			
			
			return apd.findAll();
		}

		
	
		///////////////////////////////Guarantor////////////////////////
		
		@Override
		public List<Guarantor> getGuranter() 
		{
			List<Guarantor> list=gr.findAll();
			return null;
		}

		@Override
		public Guarantor saveGauranter(Guarantor p) {
			
			Guarantor g=gr.save(p);
			return null;
		}

		@Override
		public void deleteGuranter(Integer guranterId) {
			gr.deleteById(guranterId);
			
		}

		@Override
		public Guarantor updateGuarantor(Integer guranterId, Guarantor c) {
			
			Optional<Guarantor> op  = gr.findById(guranterId);
			 if(op.isPresent()) 
			 {
				 Guarantor gur= op.get();
				 gur.setGurantorId(c.getGurantorId());
				 gur.setGuarantorFname(c.getGuarantorFname()); 
				 return   gr.save(gur);
			 }
			 else
			 {
				 return null;
			 }
		
		}

		

		@Override
		public List<Guarantor> saveAllDocument(Guarantor document) {
			
			gr.save(document);
			return gr.findAll();
		}

		
	
////////Address////////////////////
		@Override
		public Address PostCustomer(Address a)
		{
			Address aa=ar.save(a);
			
			return aa;
		}

////////Disbustment////////////////////
		@Override
		public List<LoanDisbusment> getLoanDisburst() {
			
			List<LoanDisbusment> list=ldr.findAll();
			return list;
		}

		@Override
		public LoanDisbusment saveLoanDisburst(LoanDisbusment ld) {
			LoanDisbusment loan=ldr.save(ld);
			return loan;
		}

		@Override
		public LoanDisbusment updateLoanDisburstment(Integer agreementId, LoanDisbusment ld) {
			Optional<LoanDisbusment> op  = ldr.findById(agreementId);
			 if(op.isPresent()) 
			 {
				 LoanDisbusment loan=op.get();
				 loan.setAgreementId(ld.getAgreementId());
				 loan.setLoanNo(ld.getLoanNo());
				 
				
				 return   ldr.save(loan);
			 }
			 else
			 {
				 return null;
			 }
		}

		@Override
		public void deleteLoanDisburst(Integer agreementId) {
			ldr.deleteById(agreementId);
			
		}
		
		///////////////Account Details//////////////////

		@Override
		public List<AccountDetails> getAccountDetails() {
			List<AccountDetails> list=adr.findAll();
			return list;
		}

		@Override
		public AccountDetails saveAccountDetails(AccountDetails ad) {
			AccountDetails detail=adr.save(ad);
			return detail;
		}

		@Override
		public AccountDetails updateAccountDetails(Integer accountId, AccountDetails ad) 
		{
			Optional<AccountDetails> op  = adr.findById(accountId);
			 if(op.isPresent()) 
			 {
				 AccountDetails account=op.get();
				 account.setAccountId(ad.getAccountId());
				 account.setAccountType(ad.getAccountType());
				
				 return  adr.save(account);
			 }
			 else
			 {
				 return null;
			 }
			
		}

		@Override
		public void deleteAccountDetails(Integer accountId) {
			adr.deleteById(accountId);
			
		}
	
	
	

}
