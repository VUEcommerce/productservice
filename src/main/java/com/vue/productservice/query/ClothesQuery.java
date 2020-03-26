package com.vue.productservice.query;

import javax.transaction.Transactional;

import com.vue.productservice.model.Clothes;
import com.vue.productservice.repository.ClothesRepository;

import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class ClothesQuery implements GraphQLQueryResolver {

    private final ClothesRepository clothesRepository;

    public ClothesQuery(ClothesRepository clothesRepository) {
        this.clothesRepository = clothesRepository;
    }

    @Transactional
    public Clothes clothes(String id) {
        return clothesRepository.findById(id).get();
    }

}