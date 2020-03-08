package com.vue.productservice.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Getter
@Setter
@EqualsAndHashCode
@RequiredArgsConstructor
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @NonNull
    @Column(name = "sku", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String sku;

    @NonNull
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