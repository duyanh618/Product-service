package com.ecommerce.product.controller;

import com.ecommerce.product.dto.ProductDTO;
import com.ecommerce.product.entity.*;
import com.ecommerce.product.service.ProductService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    
    @GetMapping
    public ResponseEntity<List<SanPham>> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }
    @GetMapping("/exists/{id}")
    public ResponseEntity<Boolean> existsById(@PathVariable Integer id) {
        return ResponseEntity.ok(productService.exitstByID(id));
    }
    @GetMapping("/productinfo/{id}")
    public ResponseEntity<ProductDTO> getProductInfo(@PathVariable Integer id) {
        return ResponseEntity.ok(productService.getProductInfo(id));
    }
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<SanPham> getProductById(@PathVariable Integer id) {
        return ResponseEntity.ok(productService.getProductById(id));
    }
    
    @GetMapping("/category/{maTL}")
    public ResponseEntity<List<SanPham>> getByCategory(@PathVariable String maTL) {
        return ResponseEntity.ok(productService.getProductsByCategory(maTL));
    }
    
    @PostMapping
    public ResponseEntity<SanPham> createProduct(@Valid @RequestBody SanPham sanPham) {
        return ResponseEntity.ok(productService.createProduct(sanPham));
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<SanPham> updateProduct(@PathVariable Integer id, @RequestBody SanPham sanPham) {
        return ResponseEntity.ok(productService.updateProduct(id, sanPham));
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Integer id) {
        productService.deleteProduct(id);
        return ResponseEntity.ok().build();
    }
}