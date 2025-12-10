package com.foodapp.product.dto;

import lombok.Data;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;

@Data
public class ProductRequest {
    @NotBlank(message = "Tên sản phẩm không được để trống")
    private String name;
    
    private String description;
    
    @NotNull(message = "Giá không được để trống")
    @DecimalMin(value = "0.0", message = "Giá phải lớn hơn 0")
    private BigDecimal price;
    
    private String imageUrl;
    
    @NotNull(message = "Danh mục không được để trống")
    private Long categoryId;
    
    
    private Boolean available;
}