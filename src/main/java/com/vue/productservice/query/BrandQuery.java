package com.vue.productservice.query;

import com.vue.productservice.model.Brand;
import com.vue.productservice.repository.BrandRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class BrandQuery implements GraphQLQueryResolver {

    @Autowired
    private BrandRepository brandRepository;

    public Brand brand(String id) {
        return brandRepository.findById(id).get();
    }

}