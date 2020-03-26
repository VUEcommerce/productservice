package com.vue.productservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
@Entity(name = "product_clothes")
public class Clothes extends Product  {

    @Enumerated(EnumType.STRING)
    @Column(name = "size", nullable = true)
    private Size size;

    public enum Size {
        ExtraSmall,
        Small,
        Medium,
        Large,
        ExtraLarge
    }
}