package com.ecommerce.product.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "TheLoai")
@Data
public class TheLoai {
    @Id
    @Column(name = "MaTL", length = 10)
    @NotNull
    private String maTL;
    
    @NotNull
    @Column(name = "TenTL", length = 255)
    private String tenTL;
    
    @OneToMany(mappedBy = "theLoai", cascade = CascadeType.ALL)
    private List<SanPham> sanPhams;
}