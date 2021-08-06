package com.example.ecommerce.controller;

import com.example.ecommerce.assembler.ProductAssembler;
import com.example.ecommerce.model.EcommerceProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EcommerceController {

    @Autowired
    ProductAssembler productAssembler;

    @GetMapping("/ecommerceProducts")
    public EcommerceProductResponse getAllEcommerceProducts(){
        return new EcommerceProductResponse(productAssembler.getEcommerceProducts());
    }
}