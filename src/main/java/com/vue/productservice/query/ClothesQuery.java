package com.vue.productservice.query;

import com.vue.productservice.model.Clothes;
import com.vue.productservice.repository.ClothesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;

import java.util.List;

@Component
public class ClothesQuery implements GraphQLQueryResolver {

    @Autowired
    private ClothesRepository clothesRepository;

    public Clothes clothes(String id) {
        return clothesRepository.findById(id).get();
    }

    public List<Clothes> clothesByBrand(String brand) {
        return clothesRepository.findByBrand(brand);
    }
    

}