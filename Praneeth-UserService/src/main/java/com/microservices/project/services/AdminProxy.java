package com.microservices.project.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.microservices.project.Models.LoanDto;
import com.microservices.project.Models.TransactionDto;

public interface AdminProxy {
	@PostMapping("/appyloan")
	public LoanDto InsertLoan(@RequestBody LoanDto loan);
	
	@PostMapping("/doTransaction")
	public TransactionDto doTransaction(@RequestBody TransactionDto transaction);
	
	@GetMapping("/findAccountByNumberAndDate/{account_number}/{date_of_transaction}")
	public Optional<TransactionDto> findAccountByNumberAndDate(@PathVariable("accountnumber") String account_number,@PathVariable("date") Date date_oftransaction);
	
	@GetMapping("/findByAccountNumber/{account_number}")
	public List<TransactionDto> findByAccountNumber(@PathVariable("accountnumber") String account_number);
	

}
