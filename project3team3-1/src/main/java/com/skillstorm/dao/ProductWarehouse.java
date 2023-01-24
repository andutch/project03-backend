package com.skillstorm.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.skillstorm.entity.Product;

@CrossOrigin(origins={"*"})
public interface ProductWarehouse extends JpaRepository<Product, Long> {
	
	Page<Product> findByWarehouseId(@Param("id") Long id, Pageable pageable);
}
