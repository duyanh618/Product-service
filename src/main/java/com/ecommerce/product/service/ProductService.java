package com.ecommerce.product.service;

import com.ecommerce.product.dto.ProductDTO;
import com.ecommerce.product.entity.*;
import com.ecommerce.product.repository.*;
import com.ecommerce.product.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final TheLoaiRepository theLoaiRepository;
    private final SanPhamRepository sanPhamRepository;
    private final AnhRepository anhRepository;
    private final ProductMapper productMapper;
    
    public List<SanPham> getAllProducts() {
        return sanPhamRepository.findAll();
    }
    
    public SanPham getProductById(Integer id) {
        return sanPhamRepository.findById(id).orElse(null);
    }
    
    public List<SanPham> getProductsByCategory(String maTL) {
        return sanPhamRepository.findByTheLoaiMaTL(maTL);
    }
    
    public boolean exitstByID(Integer id){
        return sanPhamRepository.existsById(id);
    }
    public ProductDTO getProductInfo(Integer ID){
        
        return productMapper.toDTO(sanPhamRepository.findById(ID).orElse(null));
    }
    @Transactional
    public TheLoai createCategory(TheLoai theLoai) {
        return theLoaiRepository.save(theLoai);
    }
    
    public List<TheLoai> getAllCategories() {
        return theLoaiRepository.findAll();
    }
    
    @Transactional
    public SanPham createProduct(SanPham sanPham) {
        return sanPhamRepository.save(sanPham);
    }
    
    @Transactional
    public SanPham updateProduct(Integer id, SanPham sanPham) {
        if (sanPhamRepository.existsById(id)) {
            sanPham.setMaSP(id);
            return sanPhamRepository.save(sanPham);
        }
        return null;
    }
    
    @Transactional
    public void deleteProduct(Integer id) {
        sanPhamRepository.deleteById(id);
    }
}