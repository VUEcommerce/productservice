package com.vue.productservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Entity
@Table(name = "ProductModel")
@Inheritance(strategy = InheritanceType.JOINED)
public class Product {

    public Product() {

    }

    public Product(String sku, String name) {
        this.sku = sku;
        this.name = name;
    }

    @Id
    @Column(name = "SKU", nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String sku;

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