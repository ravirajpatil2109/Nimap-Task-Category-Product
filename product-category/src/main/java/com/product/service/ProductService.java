package com.product.service;

import com.product.entity.Product;
import org.springframework.data.domain.Page;

public interface ProductService {
    Page<Product> getAllProducts(int page);
    Product getProductById(int id);
    Product createProduct(Product product);
    Product updateProduct(int id, Product product);
    void deleteProduct(int id);
}
