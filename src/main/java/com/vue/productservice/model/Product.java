package com.vue.productservice.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Table
@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Product implements GraphQLQueryResolver {

    @NonNull
    @Id
    private String sku;

    @NonNull
    private String name;

    private String brand;
    private Float price;
    private Integer quantity;
    private String description;
    private Float weight;
    private String image;

    public Product() {}


}