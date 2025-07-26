package com.example.chatapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.chatapp.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

}
