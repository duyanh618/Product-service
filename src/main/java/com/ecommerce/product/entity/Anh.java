package com.ecommerce.product.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Table(name = "Anh")
@Data
public class Anh {
    @Id
    @Column(name = "MaAnh", length = 10)
    @NotNull
    private String maAnh;
    
    @NotNull
    @Column(name = "AnhMH", length = 255)
    private String anhMH;
    
    @NotNull
    @Column(name = "SanPhammaSP")
    private Integer sanPhammaSP;
    
    @ManyToOne
    @JoinColumn(name = "SanPhammaSP", insertable = false, updatable = false)
    private SanPham sanPham;
}