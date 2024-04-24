package com.LeadToRev.productCatalogueSystem.service;

import java.util.List;

import com.LeadToRev.productCatalogueSystem.model.Product;

public interface ProductService {
    Product addProduct(Product product);
    Product getProduct(String id);
    List<Product> getAllProducts();
    Product updateProduct(String id, Product product);
    void deleteProduct(String id);
}


