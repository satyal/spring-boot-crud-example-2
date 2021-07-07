package com.springboot.crud.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.crud.example.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}

