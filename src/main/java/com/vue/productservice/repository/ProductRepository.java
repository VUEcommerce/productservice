package com.vue.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vue.productservice.model.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}