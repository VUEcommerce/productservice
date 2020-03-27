package com.vue.productservice.mutation;

import com.vue.productservice.model.Brand;
import com.vue.productservice.repository.BrandRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class BrandMutation implements GraphQLMutationResolver {

    @Autowired
    private BrandRepository brandRepository;

    public Brand createBrand(Brand brand) {
        return brandRepository.save(brand);
    }

    public void updateBrand(Brand brand) {
        brandRepository.updateBrand(brand.getId(), brand.getName(), brand.getActive(), 
                brand.getRate(), brand.getFollow(), brand.getLocation(), brand.getImg(), 
                brand.getJoindate(), brand.getLastmod(), brand.getInstag(), brand.getFb(), 
                brand.getShopif());
    }

    public void deleteBrand(String id) {
        brandRepository.deleteById(id);
    }
}