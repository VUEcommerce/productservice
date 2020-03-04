package com.vue.productservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

    @GetMapping("/product")
    public ResponseEntity<String> getProduct(
        @RequestParam String brandId,
        @RequestParam String name,
        @RequestParam String search,
        @RequestParam int page,
        @RequestParam int size) 
    {
        
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

}