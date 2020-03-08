package com.vue.productservice.service;

import java.util.Optional;

import com.vue.productservice.model.Product;
import com.vue.productservice.repository.ProductRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(final ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional(readOnly = true)
    public Optional<Product> getProduct(final int sku) {
        return this.productRepository.findById(sku);
    }
}