package com.ecommerce.product.dto;
import com.ecommerce.product.entity.SanPham;
import com.ecommerce.product.dto.ProductDTO;
import org.mapstruct.Mapper;
@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductDTO toDTO(SanPham sp);
    SanPham toEntity(ProductDTO dto);
}
