package com.vue.productservice.query;

import com.vue.productservice.model.Brand;
import com.vue.productservice.repository.BrandRepository;

import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class BrandQuery implements GraphQLQueryResolver {

    private final BrandRepository brandRepository;

    public BrandQuery(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    public Brand brand(String id) {
        return brandRepository.findById(id).get();
    }

}