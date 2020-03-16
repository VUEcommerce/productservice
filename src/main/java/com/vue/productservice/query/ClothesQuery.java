package com.vue.productservice.query;

import com.vue.productservice.model.Clothes;
import com.vue.productservice.repository.ClothesRepository;

import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ClothesQuery implements GraphQLQueryResolver {

    private final ClothesRepository clothesRepository;

    public ClothesQuery(ClothesRepository clothesRepository) {
        this.clothesRepository = clothesRepository;
    }

    public Clothes getClothes(String sku, String name) {
        return clothesRepository.findBySkuAndName(sku, name);
    }

}