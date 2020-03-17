package com.vue.productservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
@Entity
@Table(name = "Clothes")
public class Clothes extends Product  {

    @Enumerated(EnumType.STRING)
    @Column(name = "size", nullable = true)
    private Size size;

    enum Size {
        ExtraSmall,
        Small,
        Medium,
        Large,
        ExtraLarge
    }
}