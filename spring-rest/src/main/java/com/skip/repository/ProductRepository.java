package com.skip.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skip.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
