package com.vue.productservice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.vue.productservice.model.Clothes;
import com.vue.productservice.repository.ClothesRepository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class JpaTest {
    
    @Autowired
    private ClothesRepository clothesRepository;

    private Clothes clothes;

    @Before
    public void loadData() {
        clothes = new Clothes();
        clothes.setId("000001");
        clothes.setSku("S00001");
        clothes.setName("NAME_000001");
        clothes.setBrand("BRAND_A");
        clothes.setDescription("BRAND_A");
        clothes.setImage("http://image.com");
        clothes.setPrice(10.00f);
        clothes.setQuantity(1);
        clothes.setWeight(1.0f);
        clothes.setSize(Clothes.Size.Medium);

        clothesRepository.save(clothes);
    }

    @Test
    public void whenFindBySkuthenReturnClothes() {

        assertEquals(clothes.getId(), clothesRepository.findById(clothes.getId()).get().getId(), 
                "JPA repo result does not matched");
    }


}