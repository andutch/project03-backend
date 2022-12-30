package com.project03.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.project03.entity.Product;

@CrossOrigin("http://localhost:4200")
public interface ProductWarehouse extends JpaRepository<Product, Long> {
}
