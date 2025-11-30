package com.ecommerce.product.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "SanPham")
@Data
public class SanPham {
    @Id
    @Column(name = "maSP")
    @NotNull(message = "Mã sản phẩm không được để trống")
    private Integer maSP;
    
    @NotNull
    @Column(name = "tenSP", length = 255)
    private String tenSP;
    
    @NotNull
    @Column(name = "KhoiLuong")
    private Integer khoiLuong;
    
    @NotNull
    @Column(name = "GiaTien")
    private Integer giaTien;
    

    @Column(name = "MoTa", length = 255)
    private String moTa;
    
    @NotNull
    @Column(name = "TheLoaiMaTL", length = 10)
    private String theLoaiMaTL;
    
    @ManyToOne
    @JoinColumn(name = "TheLoaiMaTL", insertable = false, updatable = false)
    private TheLoai theLoai;
    
    @OneToMany(mappedBy = "sanPham", cascade = CascadeType.ALL)
    private List<Anh> anhs;
}
