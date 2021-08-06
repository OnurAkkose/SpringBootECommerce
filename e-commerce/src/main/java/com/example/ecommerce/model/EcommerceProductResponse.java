package com.example.ecommerce.model;

import java.util.List;

public class EcommerceProductResponse {
    private List<EcommerceProduct> ecommerceProducts;

    public EcommerceProductResponse(List<EcommerceProduct> ecommerceProducts){
        this.ecommerceProducts = ecommerceProducts;
    }

    public List<EcommerceProduct> getEcommerceProducts() {
        return ecommerceProducts;
    }

    public void setEcommerceProducts(List<EcommerceProduct> ecommerceProducts) {
        this.ecommerceProducts = ecommerceProducts;
    }
}