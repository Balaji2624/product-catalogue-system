package com.LeadToRev.productCatalogueSystem.model;

import lombok.Data;

@Data
public class Rating {
    private String userId;
    private int rating;
    private String comment;
}

