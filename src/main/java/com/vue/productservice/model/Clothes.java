package com.vue.productservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ClothesModel")
public class Clothes extends Product {

    public Clothes(String sku, String name, String brand, Float price, 
            Integer quantity, String description, Float weight, 
            String image, Size size) {
        super(sku, name, brand, price, quantity, description, weight, image);
        this.size = size;
    }

    public Clothes(String sku, String name) {
        super(sku, name);
    }

    public Clothes() {

    }

    @Enumerated(EnumType.STRING)
    @Column(name = "Size", nullable = true)
    private Size size;

    public enum Size {
        ExtraSmall,
        Small,
        Medium,
        Large,
        ExtraLarge
    }

}
