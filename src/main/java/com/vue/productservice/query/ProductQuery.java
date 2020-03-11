package com.vue.productservice.query;

import java.util.Optional;

import com.vue.productservice.model.Product;
import com.vue.productservice.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class ProductQuery implements GraphQLQueryResolver {

    @Autowired
    private ProductService productService;

    public Optional<Product> getProduct(final int id) {
        return this.productService.getProduct(id);
    }
}