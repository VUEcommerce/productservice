package com.vue.productservice.repository;

import java.util.Optional;
import java.util.List;

import com.vue.productservice.model.Clothes;
import com.vue.productservice.model.Clothes.Size;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface ClothesRepository extends JpaRepository<Clothes, String> {

    @Override
    @Query(value = "SELECT * FROM product_clothes WHERE id=?", nativeQuery = true)
    Optional<Clothes> findById(String id);

    @Query(value = "SELECT * FROM product_clothes where brand=?", nativeQuery = true)
    List<Clothes> findByBrand(String brand);

    @Modifying
    @Query(value = "UPDATE product_clothes SET sku=?2,name=?3,price=?4,qty=?5,desc=?6,wt?7,img=?8,size=?9 WHERE id=?1", nativeQuery = true)
    void updateClothes(String id, String sku, String name, Float price, Integer quantity, 
            String description, Float weight, String image, Size size);

    @Modifying
    @Query(value = "DELETE FROM product_clothes WHERE id=?", nativeQuery = true)
    void deleteById(String id);

}