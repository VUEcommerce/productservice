package com.vue.productservice.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
@AllArgsConstructor
public class Product implements GraphQLQueryResolver {

    private String brand;
    private String name;
    private Float price;
    private Integer quantity;
    private String sku;
    private String description;
    private Float weight;
    private String image;
}