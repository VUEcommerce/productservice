package com.vue.productservice.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@ToString
@MappedSuperclass
public class Product {

    @Id
    @Column(name = "id", nullable = false, updatable = false)
    private String id;

    @Column(name = "sku", nullable = false)
    private String sku;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "brand", nullable = true)
    private String brand;

    @Column(name = "price", nullable = true)
    private Float price;

    @Column(name = "quantity", nullable = true)
    private Integer quantity;

    @Column(name = "description", nullable = true)
    private String description;

    @Column(name = "weight", nullable = true)
    private Float weight;

    @Column(name = "image", nullable = true)
    private String image;

}