package com.springbootweektwo.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.springbootweektwo.inventoryManagement.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
