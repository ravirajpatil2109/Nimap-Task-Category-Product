package com.product.controller;

import com.product.entity.Category;
import com.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//CategoryController.java
@RestController
@RequestMapping("/api/categories")
public class CategoryController {

 @Autowired
 private CategoryService categoryService;

 @GetMapping
 public Page<Category> getAllCategories(@RequestParam(defaultValue = "0") int page) {
     return categoryService.getAllCategories(page);
 }

 @GetMapping("/{id}")
 public ResponseEntity<Category> getCategoryById(@PathVariable int id) {
     Category category = categoryService.getCategoryById(id);
     return category != null ? ResponseEntity.ok(category) : ResponseEntity.notFound().build();
 }

 
 // POST to create a new category
 @PostMapping
 public Category createCategory(@RequestBody Category category) {
     return categoryService.createCategory(category);
 }

 @PutMapping("/{id}")
 public ResponseEntity<Category> updateCategory(@PathVariable int id, @RequestBody Category category) {
     Category updated = categoryService.updateCategory(id, category);
     return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
 }


 @DeleteMapping("/{id}")
 public ResponseEntity<Void> deleteCategory(@PathVariable int id) {
     categoryService.deleteCategory(id);
     return ResponseEntity.noContent().build();
 }
}
