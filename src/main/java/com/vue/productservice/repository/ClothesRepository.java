package com.vue.productservice.repository;

import java.util.List;

import com.vue.productservice.model.Clothes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClothesRepository extends JpaRepository<Clothes, String> {

    Clothes findBySkuAndName(String sku, String name);

    @Query(value = "SElECT * FROM ClothesModel LEFT JOIN ProductModel ON ClothesModel.SKU = ProductModel.SKU", 
            nativeQuery = true)
    List<Clothes> findAll();

}