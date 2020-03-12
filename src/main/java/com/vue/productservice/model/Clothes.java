package com.vue.productservice.model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Clothes extends Product {

    public Clothes(int sku, String name) {
        super(sku, name);
    }

    private Size size;

    public enum Size {
        ExtraSmall,
        Small,
        Medium,
        Large,
        ExtraLarge
    }

}
