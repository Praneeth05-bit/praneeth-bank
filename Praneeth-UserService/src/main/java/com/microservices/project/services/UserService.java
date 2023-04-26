package com.microservices.project.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.microservices.project.Models.TransactionDto;
import com.microservices.project.Models.Customer;
import com.microservices.project.Models.LoanDto;

/*1.	A user he can register him/her selves to the application
2.	As a user, he/she can be able to apply for a loan in a specific branch.
3.	As a user he/she can be able to perform withdrawal or deposit amount
4.	As a user can be able to view all his / her selected transactions ie., withdraw or deposit for a specific period.
5.	Display all transactions for a specific period.
*/
public interface UserService {
	public Customer insertCustomer(Customer customer);
	public LoanDto InsertLoan(LoanDto loan);
	public TransactionDto doTransaction(TransactionDto transaction);
	public Optional<TransactionDto> findAccountByNumberAndDate(String account , Date date_of_transaction);
	public List<TransactionDto> findByAccountNumber(String account_number);
	

}
