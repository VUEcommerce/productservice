package com.vue.productservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.Optional;

import com.graphql.spring.boot.test.GraphQLResponse;
import com.graphql.spring.boot.test.GraphQLTest;
import com.graphql.spring.boot.test.GraphQLTestTemplate;
import com.vue.productservice.model.Clothes;
import com.vue.productservice.repository.ClothesRepository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@ComponentScan("com.vue.productservice.repository")
@RunWith(SpringRunner.class)
@GraphQLTest
public class ProductGraphQLTest {

    @Autowired
    private GraphQLTestTemplate testTemplate;

    @MockBean
    private ClothesRepository clothesRepository;

    private Clothes clothes;

    @Before
    public void setClothes() {
        this.clothes = new Clothes();
        this.clothes.setId("000001");
        this.clothes.setSku("S00001");
        this.clothes.setName("NAME_000001");
    }

    @Test
    public void whenFindByIdthenReturnClothes() throws IOException {
        when(clothesRepository.findById(any())).thenReturn(Optional.of(this.clothes));

        GraphQLResponse response = testTemplate.postForResource("get-clothes-by-id.graphql");
        //assertTrue(response.isOk());
        // assertEquals("000001", response.get("${$.data.getClothes.id}"));
        // assertEquals("S00001", response.get("${$.data.getClothes.sku}"));
        // assertEquals("NAME_000001", response.get("${$.data.getClothes.name}"));
    }
    
}