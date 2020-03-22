package com.vue.productservice.config;

import java.io.IOException;

import javax.annotation.PostConstruct;

import com.vue.productservice.model.Product;
import com.vue.productservice.query.ClothesQuery;
import com.vue.productservice.repository.ClothesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import graphql.GraphQL;
import graphql.kickstart.tools.SchemaParser;
import graphql.schema.GraphQLSchema;

@Configuration
public class GraphQLConfig {

    private GraphQL graphQL;

    @Autowired
    private ClothesRepository clothesRepository;

    @PostConstruct 
    public void init() throws IOException {
        GraphQLSchema graphQLSchema = schema();
        this.graphQL = GraphQL.newGraphQL(graphQLSchema).build();
    }

    @Bean
    public GraphQL graphQL() {
        return graphQL;
    }

    @Bean
    public GraphQLSchema schema() {
        return SchemaParser.newParser()
                .file("vue.graphql")
                .resolvers(new ClothesQuery(clothesRepository))
                .dictionary(Product.class)
                .build().makeExecutableSchema();
    }

}