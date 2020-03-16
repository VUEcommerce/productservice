package com.vue.productservice.repository;

import com.vue.productservice.model.Clothes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClothesRepository extends JpaRepository<Clothes, String> {

    @Query(value = "SELECT * FROM Clothes WHERE sku=?", nativeQuery = true)
    Clothes findBySku(String sku);

    @Query(value = "SELECT * FROM Clothes WHERE sku=?1 AND name=?2", nativeQuery = true)
    Clothes findBySkuAndName(String sku, String name);
}