# Nimap Task - Category and Product CRUD Operations with Pagination

This repository contains the solution for the Nimap Infotech Java Task, where I implemented a Spring Boot application with REST API endpoints to manage Categories and Products. The project includes CRUD operations and server-side pagination.

## Project Overview

The task required the development of a Spring Boot application with RESTful APIs to manage the following:

1. **Category CRUD operations**:
   - Fetch all categories with pagination.
   - Create a new category.
   - Retrieve a category by ID.
   - Update a category by ID.
   - Delete a category by ID.

2. **Product CRUD operations**:
   - Fetch all products with pagination.
   - Create a new product.
   - Retrieve a product by ID.
   - Update a product by ID.
   - Delete a product by ID.

3. **Relationship**:
   - A one-to-many relationship between Categories and Products, where one category can have multiple products.

4. **Server-side Pagination**:
   - Pagination implemented for both Category and Product APIs.

5. **Populated Response**:
   - Single product details fetches category details as well.

## Technologies Used

- **Java** (Spring Boot)
- **Spring Data JPA** (for ORM and DB interactions)
- **Hibernate** (for DB operations)
- **MySQL** (Relational Database)
- **Spring Web** (for creating RESTful APIs)

## API Endpoints

### Category API Endpoints

1. **GET all categories (with pagination)**  
   URL: `http://localhost:8080/api/categories?page=3`  
   Description: Fetches a paginated list of all categories.

2. **POST create a new category**  
   URL: `http://localhost:8080/api/categories`  
   Description: Creates a new category.

3. **GET category by ID**  
   URL: `http://localhost:8080/api/categories/{id}`  
   Description: Fetches a category by its ID.

4. **PUT update category by ID**  
   URL: `http://localhost:8080/api/categories/{id}`  
   Description: Updates an existing category by its ID.

5. **DELETE category by ID**  
   URL: `http://localhost:8080/api/categories/{id}`  
   Description: Deletes a category by its ID.

### Product API Endpoints

1. **GET all products (with pagination)**  
   URL: `http://localhost:8080/api/products?page=2`  
   Description: Fetches a paginated list of all products.

2. **POST create a new product**  
   URL: `http://localhost:8080/api/products`  
   Description: Creates a new product.

3. **GET product by ID**  
   URL: `http://localhost:8080/api/products/{id}`  
   Description: Fetches a product by its ID, along with the category details.

4. **PUT update product by ID**  
   URL: `http://localhost:8080/api/products/{id}`  
   Description: Updates an existing product by its ID.

5. **DELETE product by ID**  
   URL: `http://localhost:8080/api/products/{id}`  
   Description: Deletes a product by its ID.

## Database Configuration

The project uses **MySQL** as the relational database, with Spring Data JPA for ORM-based database interaction. The configuration is set up via **application.properties** to connect to a MySQL database instance.

## One-to-Many Relationship

The project demonstrates a one-to-many relationship between Categories and Products:

- One category can have multiple products.
- When fetching a single product, its associated category details are included in the response.

## Server-Side Pagination

Pagination is implemented for both the Category and Product APIs. The server-side pagination ensures that only a subset of records is fetched at a time, improving performance when dealing with large datasets.

### Example:

To fetch the 3rd page of categories, use:  
`GET http://localhost:8080/api/categories?page=3`

## How to Run the Project

1. Clone this repository:
   ```bash
   git clone https://github.com/ravirajpatil2109/Nimap-Task-Category-Product.git
