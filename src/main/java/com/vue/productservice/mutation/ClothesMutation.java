package com.vue.productservice.mutation;

import javax.transaction.Transactional;

import com.vue.productservice.model.Clothes;
import com.vue.productservice.repository.ClothesRepository;

import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class ClothesMutation implements GraphQLMutationResolver {

    private final ClothesRepository clothesRepository;

    public ClothesMutation(ClothesRepository clothesRepository) {
        this.clothesRepository = clothesRepository;
    }

    @Transactional
    public Clothes saveClothes(Clothes clothes) {
        return clothesRepository.save(clothes);
    }
}