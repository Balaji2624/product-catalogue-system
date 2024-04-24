package com.LeadToRev.productCatalogueSystem.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;
import java.util.Map;
import lombok.Data;

@Data
@Document(collection = "products")
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private double price;
    private List<String> categories;
    private List<Map<String, String>> attributes;
    private Availability availability;
    private List<Rating> ratings;
}

