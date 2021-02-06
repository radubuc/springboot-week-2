package com.springbootweektwo.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.springbootweektwo.inventoryManagement.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
