package com.LeadToRev.productCatalogueSystem.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.LeadToRev.productCatalogueSystem.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

	
}
