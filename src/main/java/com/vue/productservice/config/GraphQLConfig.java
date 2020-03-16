package com.vue.productservice.config;

import java.io.IOException;

import javax.annotation.PostConstruct;

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

    @Autowired
    private ClothesRepository clothesRepository;

    private GraphQL graphQL;

    @PostConstruct 
    public void init() throws IOException {
        GraphQLSchema graphQLSchema = schema(clothesRepository);
        this.graphQL = GraphQL.newGraphQL(graphQLSchema).build();
    }

    @Bean
    public GraphQL graphQL() {
        return graphQL;
    }

    @Bean
    public GraphQLSchema schema(ClothesRepository clothesRepository) {
        return SchemaParser.newParser()
                .file("product.graphqls")
                .resolvers(new ClothesQuery(clothesRepository))
                .build().makeExecutableSchema();
    }

}