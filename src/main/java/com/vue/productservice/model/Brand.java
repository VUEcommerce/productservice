package com.vue.productservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity(name = "brand")
public class Brand {

    @Id
    @Column(name = "id", nullable = false, updatable = false)
    private String id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "active", nullable = true)
    private Boolean active;

    @Column(name = "rate", nullable = true)
    private Integer rate;

    @Column(name= "follow", nullable = true)
    private Integer follow;

    @Column(name = "locatn", nullable = true)
    private String location;

    @Column(name = "img", nullable = true)
    private String img;

    @Column(name = "joind", nullable = true)
    private String joindate;

    @Column(name = "lastmod", nullable = true)
    private String lastmod;

    @Column(name = "instag", nullable = true)
    private String instag;

    @Column(name = "fb", nullable = true)
    private String fb;

    @Column(name = "shopif", nullable = true)
    private String shopif;

}