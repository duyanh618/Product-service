package com.ecommerce.product.repository;

import com.ecommerce.product.entity.Anh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnhRepository extends JpaRepository<Anh, String> {
}