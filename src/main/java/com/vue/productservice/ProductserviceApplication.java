package com.vue.productservice;

import com.vue.productservice.query.ClothesQuery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import graphql.kickstart.tools.SchemaParser;
import graphql.schema.GraphQLSchema;

@SpringBootApplication
public class ProductserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductserviceApplication.class, args);
	}

	@Bean
	GraphQLSchema schema() {
        return SchemaParser.newParser()
                       .file("product.graphqls")
                       .resolvers(new ClothesQuery())
                       .build()
                       .makeExecutableSchema();
    }
}
