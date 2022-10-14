package com.cjc.homeloanproject.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.homeloanproject.app.model.AllPersonDocument;
import com.cjc.homeloanproject.app.model.Customer;
import com.cjc.homeloanproject.app.model.Guarantor;
import com.cjc.homeloanproject.app.service.HomeLoanServiceI;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class AllPersonDocumentController {
	
	@Autowired
	HomeLoanServiceI hlsi;
	
	//@GetMapping("/getAllPerson")
	//public ResponseEntity<AllPersonDocument> personDocument()
	
	@PostMapping(value="/uploadDoc/{customerId}",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<AllPersonDocument> uploadFile(@PathVariable int customerId,
			@RequestPart(value="docId",required = true) Integer docId,
			@RequestPart(value="adharcard",required = true) MultipartFile file1,
			@RequestPart(value="pancard",required=true) MultipartFile file2,
			@RequestPart(value="photo",required=true) MultipartFile file3,
			@RequestPart(value="sign",required=true) MultipartFile file4,
			@RequestPart(value="customerId",required=true) Integer custId,
			
			@RequestPart(value="incomeproof",required=true) MultipartFile file5) throws Exception
	{
			//Customer c= hlsi.findCustomer(customerId);
		
		//ObjectMapper om=new ObjectMapper();
		
		//AllPersonDocument d=om.readValue(customerId,AllPersonDocument.class);
		//ObjectMapper om=new ObjectMapper();
		//AllPersonDocument d=om.readValue(customerId,AllPersonDocument.class);
		//AllPersonDocument document=c.getAllpersondocument();
//		AllPersonDocument document=d.getAllpersondocument();
//		
//		
//		document.setPhoto(file1.getBytes());
//		document.setPancard(file2.getBytes());
//		document.setAdharcard(file3.getBytes());
//		document.setSign(file4.getBytes());
//		document.setIncomeproof(file5.getBytes());
//		List<AllPersonDocument>list=hlsi.saveDocument(document);
//		
//		return (ResponseEntity<AllPersonDocument>) list;
		
		ObjectMapper om=new ObjectMapper();
		//AllPersonDocument d=om.readValue(custId,AllPersonDocument .class);
		//AllPersonDocument d=custo, MyValue.class);
		//AllPersonDocument d=om.readValue(custId, AllPersonDocument.class);
		AllPersonDocument d=om.readValue(custId, AllPersonDocument.class);
		Guarantor document=new Guarantor();
		//System.out.println(d.getGuarantorFname());

document.setPhoto(file1.getBytes());
document.setPancard(file2.getBytes());
document.setAdharcard(file3.getBytes());
document.setSign(file4.getBytes());
document.setIncomeproof(file5.getBytes());
document.setCustomerId(d.getCustomerId());
//document.
	List<Guarantor>list=hlsi.saveAllDocument(document);

	return (ResponseEntity<AllPersonDocument>) list;
		
	}
	    
		
		
			
	
	
	    

}
