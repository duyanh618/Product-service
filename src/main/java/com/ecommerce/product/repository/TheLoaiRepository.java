package com.ecommerce.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.product.entity.TheLoai;

@Repository
public interface TheLoaiRepository extends JpaRepository<TheLoai, String> {
}