package com.ecommerce.product.dto;

import jakarta.persistence.criteria.CriteriaBuilder.In;

public class ProductDTO {
    private Integer maSP;
    private String tensp;
    private int giaTien;
    private int khoiLuong;
    public ProductDTO(Integer maSP, String tensp, int giaTien, int khoiLuong) {
        this.maSP = maSP;
        this.tensp = tensp;
        this.giaTien = giaTien;
        this.khoiLuong = khoiLuong;
    }
    public Integer getMaSP() {
        return maSP;
    }
    public void setMaSP(Integer maSP) {
        this.maSP = maSP;
    }
    public String getTensp() {
        return tensp;
    }
    public void setTensp(String tensp) {
        this.tensp = tensp;
    }
    public int getGiaTien() {
        return giaTien;
    }
    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }
    public int getKhoiLuong() {
        return khoiLuong;
    }
    public void setKhoiLuong(int khoiLuong) {
        this.khoiLuong = khoiLuong;
    }
    
    
    
}
