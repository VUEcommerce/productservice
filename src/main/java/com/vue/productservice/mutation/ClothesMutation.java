package com.vue.productservice.mutation;

import com.vue.productservice.model.Clothes;
import com.vue.productservice.repository.ClothesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class ClothesMutation implements GraphQLMutationResolver {

    @Autowired
    private ClothesRepository clothesRepository;

    public Clothes createClothes(Clothes clothes) {
        return clothesRepository.save(clothes);
    }

    public void updateClothes(Clothes clothes) {
        clothesRepository.updateClothes(clothes.getId(), clothes.getSku(), clothes.getName(), 
                clothes.getPrice(), clothes.getQty(), clothes.getDesc(), 
                clothes.getWt(), clothes.getImg(), clothes.getSize());
    }

    public void deleteClothes(String id) {
        clothesRepository.deleteById(id);
    }

}