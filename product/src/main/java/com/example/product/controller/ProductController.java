package com.example.product.controller;

import com.example.product.model.ProductResponse;
import com.example.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/products")
    public ProductResponse getAllProducts(){
        return new ProductResponse(productRepository.findAll());
    }
}