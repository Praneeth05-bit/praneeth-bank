package com.microservices.project.Models;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_master")
public class Customer {
		private	String CUSTOMER_NUMBER;
		private	String FIRSTNAME;
		private	String middlename;
		private String lastname;
		private String	CUSTOMER_CITY;
		private	String CUSTOMER_CONTACT_NO;
		private	String occupation;
		private Date	CUSTOMER_DATE_OF_BIRTH;

}
