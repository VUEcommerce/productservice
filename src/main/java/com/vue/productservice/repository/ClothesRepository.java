package com.vue.productservice.repository;

import java.util.Optional;

import com.vue.productservice.model.Clothes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
@Repository
public interface ClothesRepository extends JpaRepository<Clothes, String> {

    @Override
    @Query(value = "SELECT * FROM Clothes WHERE id=?", nativeQuery = true)
    Optional<Clothes> findById(String id);

}