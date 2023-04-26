package com.microservices.project.Models;
import java.util.Date;

public class AccountDto {
	private String account_number;
	private String custom_number;
	private String branch_id;
	private int opening_balance;
	private Date account_opening_date;
	private String account_type;
	private String account_status;
	public AccountDto()
	{
		
	}
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public String getCustom_number() {
		return custom_number;
	}
	public void setCustom_number(String custom_number) {
		this.custom_number = custom_number;
	}
	public String getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(String branch_id) {
		this.branch_id = branch_id;
	}
	public int getOpening_balance() {
		return opening_balance;
	}
	public void setOpening_balance(int opening_balance) {
		this.opening_balance = opening_balance;
	}
	public Date getAccount_opening_date() {
		return account_opening_date;
	}
	public void setAccount_opening_date(Date account_opening_date) {
		this.account_opening_date = account_opening_date;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public String getAccount_status() {
		return account_status;
	}
	public void setAccount_status(String account_status) {
		this.account_status = account_status;
	}
	 
}
