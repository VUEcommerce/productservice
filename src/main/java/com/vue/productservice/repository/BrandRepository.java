package com.vue.productservice.repository;

import java.util.Optional;

import com.vue.productservice.model.Brand;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface BrandRepository extends JpaRepository<Brand, String> {

    @Override
    @Query(value = "SELECT * FROM brand WHERE id=?", nativeQuery = true)
    Optional<Brand> findById(String id);

    @Modifying
    @Query(value = "UPDATE brand SET name=?2,active=?3,rate=?4,follow=?5,locatn=?6,img=?7,joind=?8,lastmod=?9,instag=?10,fb=?11,shopif=?12 WHERE id=?1", nativeQuery = true)
    void updateBrand(String id, String name, Boolean active, Integer rate, Integer follow, 
            String location, String img, String joindate, String lastmod, 
            String instag, String fb, String shopif);

    @Modifying
    @Query(value = "DELETE FROM brand WHERE id=?", nativeQuery = true)
    void deleteById(String id);
}