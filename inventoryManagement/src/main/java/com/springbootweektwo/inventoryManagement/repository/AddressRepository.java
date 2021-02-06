package com.springbootweektwo.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.springbootweektwo.inventoryManagement.entity.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {

}
