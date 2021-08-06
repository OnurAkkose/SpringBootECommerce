package com.example.ecommerce.model;

import lombok.Data;

@Data
public class EcommerceProduct {

    Product product;

    String image;

    public EcommerceProduct(Product product) {
        this.product = product;
    }
}
