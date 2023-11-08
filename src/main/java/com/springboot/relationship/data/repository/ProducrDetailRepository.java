package com.springboot.relationship.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.relationship.data.entity.ProductDetail;

public interface ProducrDetailRepository extends JpaRepository<ProductDetail, Long> {
    
}
