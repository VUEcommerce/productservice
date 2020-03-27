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

    @Column(name = "qty", nullable = true)
    private Integer qty;

    @Column(name = "desc", nullable = true)
    private String desc;

    @Column(name = "wt", nullable = true)
    private Float wt;

    @Column(name = "img", nullable = true)
    private String img;

}