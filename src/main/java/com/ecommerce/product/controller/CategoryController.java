package com.ecommerce.product.controller;

import com.ecommerce.product.entity.TheLoai;
import com.ecommerce.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final ProductService productService;
    
    @GetMapping
    public ResponseEntity<List<TheLoai>> getAllCategories() {
        return ResponseEntity.ok(productService.getAllCategories());
    }
    
    @PostMapping
    public ResponseEntity<TheLoai> createCategory(@RequestBody TheLoai theLoai) {
        return ResponseEntity.ok(productService.createCategory(theLoai));
    }
}