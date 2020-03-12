package com.vue.productservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.Data;
import lombok.NonNull;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Product {

    @Id
    @NonNull
    @Column(name = "SKU", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sku;

    @NonNull
    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Brand", nullable = true)
    private String brand;

    @Column(name = "Price", nullable = true)
    private Float price;

    @Column(name = "Quantity", nullable = true)
    private Integer quantity;

    @Column(name = "Description", nullable = true)
    private String description;

    @Column(name = "Weight", nullable = true)
    private Float weight;

    @Column(name = "Image", nullable = true)
    private String image;

}