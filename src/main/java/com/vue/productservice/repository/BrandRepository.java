package com.vue.productservice.repository;

import java.util.Optional;

import com.vue.productservice.model.Brand;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface BrandRepository extends JpaRepository<Brand, String> {

    @Override
    @Query(value = "SELECT * FROM brand WHERE id=?", nativeQuery = true)
    Optional<Brand> findById(String id);
}