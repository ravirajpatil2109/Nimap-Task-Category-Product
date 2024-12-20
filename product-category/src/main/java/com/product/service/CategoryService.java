package com.product.service;

import com.product.entity.Category;
import org.springframework.data.domain.Page;

public interface CategoryService {
    Page<Category> getAllCategories(int page);
    Category getCategoryById(int id);
    Category createCategory(Category category);
    Category updateCategory(int id, Category category);
    void deleteCategory(int id);
}
