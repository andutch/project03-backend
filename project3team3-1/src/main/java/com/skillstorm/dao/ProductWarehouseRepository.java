package com.skillstorm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import org.springframework.web.bind.annotation.CrossOrigin;


import com.skillstorm.entity.ProductWarehouse;

@CrossOrigin(origins={"*"})
@RepositoryRestResource(collectionResourceRel = "productWarehouse", path = "product-warehouse")
public interface ProductWarehouseRepository extends JpaRepository<ProductWarehouse, Long> {
	
	
}
