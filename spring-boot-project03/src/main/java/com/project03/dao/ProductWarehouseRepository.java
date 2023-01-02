package com.project03.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


import com.project03.entity.ProductWarehouse;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "productWarehouse", path = "product-warehouse")
public interface ProductWarehouseRepository extends JpaRepository<ProductWarehouse, Long> {
	
	
}
