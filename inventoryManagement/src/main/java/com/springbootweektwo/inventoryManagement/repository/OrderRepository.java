package com.springbootweektwo.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.springbootweektwo.inventoryManagement.entity.Orders;

public interface OrderRepository extends CrudRepository<Orders, Long>{

}
