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

    public Clothes createClothes(Clothes clothes) {
        return clothesRepository.save(clothes);
    }

    public void updateClothes(Clothes clothes) {
        clothesRepository.updateClothes(clothes.getId(), clothes.getSku(), clothes.getName(), 
                clothes.getPrice(), clothes.getQuantity(), clothes.getDescription(), 
                clothes.getWeight(), clothes.getImage(), clothes.getSize());
    }

    public void deleteClothes(String id) {
        clothesRepository.deleteById(id);
    }

}