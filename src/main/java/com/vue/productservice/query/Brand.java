package com.vue.productservice.resolver;

import java.time.LocalDate;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
@AllArgsConstructor
public class Brand implements GraphQLQueryResolver {
    private String brandId;
    private String name;
    private Integer rating;
    private Integer followCount;
    private String facebookUrl;
    private String shopifyUrl;
    private LocalDate joinDate;
    private String profileImage;
}