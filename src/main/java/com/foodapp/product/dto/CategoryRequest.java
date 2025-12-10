package com.foodapp.product.dto;

import lombok.Data;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;

// CategoryRequest.java
@Data
public class CategoryRequest {
    @NotBlank
    private String name;
    private String description;
    private String imageUrl;
}
