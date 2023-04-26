package com.microservice.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.project.Models.Customer;

public interface CustomerDao extends JpaRepository<Customer,String>{

}
