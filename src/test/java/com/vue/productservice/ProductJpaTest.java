package com.vue.productservice;

import com.vue.productservice.model.Clothes;
import com.vue.productservice.repository.ClothesRepository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.notNullValue;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ProductJpaTest {
    
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
        clothes.setDesc("BRAND_A");
        clothes.setImg("http://image.com");
        clothes.setPrice(10.00f);
        clothes.setQty(1);
        clothes.setWt(1.0f);
        clothes.setSize(Clothes.Size.HM);

        clothesRepository.save(clothes);
    }

    @Test
    public void whenFindByIdthenReturnClothes() {
        assertThat(clothesRepository.findById(clothes.getId()).get(), notNullValue());
    }


}