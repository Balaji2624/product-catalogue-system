# product-catalogue-system

## Overview

This project is a RESTful API for managing a structured product catalog system. It allows users to perform CRUD operations on products, search for products based on various criteria, and rate products. The API is built using Java, spring boot, with MongoDB as the database.

## Features

- CRUD operations for products
- Searching products by name, category, and attributes
- Pagination and sorting for efficient data retrieval
- Rating products with user comments
- MongoDB integration for data storage

## Prerequisites

Before running this project, ensure you have the following installed:

- Java Development Kit (JDK) 11 or higher
- Apache Maven
- MongoDB Server
- 
## Set up MongoDB:

Ensure MongoDB is installed and running on your system.
Create a new database named product_catalog.

## MongoDB Response Structure: 

_id
"2"
name
"Smartphones"
description
"Product Description"
price
29.99

categories
Array (2)
0
"Laptop"
1
"Smartphones"

attributes
Array (3)

0
Object
color
"Black"

1
Object
size
"Large"

2
Object
brand
"Samsung"

availability
Object
inStock
true
quantity
100

ratings
Array (2)

0
Object
userId
"user1"
rating
4
comment
"Great product!"

1
Object
userId
"user2"
rating
5
_class
"com.LeadToRev.productCatalogueSystem.model.Product"
_id
"10"
name
"lava"
description
"Product Description"
price
40.99

categories
Array (2)
0
"Electronics"
1
"Smartphones"

attributes
Array (3)

0
Object
color
"Black"

1
Object
size
"Large"

2
Object
brand
"Samsung"

availability
Object
inStock
true
quantity
100

ratings
Array (2)

0
Object
userId
"user1"
rating
4
comment
"Great product!"

1
Object
userId
"user2"
rating
5
_class
"com.LeadToRev.productCatalogueSystem.model.Product"


