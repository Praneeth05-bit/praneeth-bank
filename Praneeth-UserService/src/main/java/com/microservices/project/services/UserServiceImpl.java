package com.microservices.project.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.microservices.project.Models.TransactionDto;
import com.microservice.project.dao.CustomerDao;
import com.microservices.project.Models.Customer;
import com.microservices.project.Models.LoanDto;

public class UserServiceImpl  implements UserService{

	@Autowired
	CustomerDao dao;
	@Autowired
	TransactionDto temp;
	@Override
	public Customer insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return dao.save(customer);
	}

	@Override
	public LoanDto InsertLoan(LoanDto loan) {
		return null;
	}

	@Override
	public TransactionDto doTransaction(TransactionDto transaction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<TransactionDto> findAccountByNumberAndDate(String account, Date date_of_transaction) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<TransactionDto> findByAccountNumber(String account_number) {
		// TODO Auto-generated method stub
		return null;
	}


}
