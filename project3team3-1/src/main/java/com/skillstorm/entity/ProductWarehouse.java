package com.skillstorm.entity;

//import lombok.Getter;
//import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="product_warehouse")
// @Data -- known bug
//@Getter
//@Setter
public class ProductWarehouse {

    public Long getId() {
		return id;
	}

	public String getWarehouseName() {
		return warehouseName;
	}

	public String getWarehouseGrid() {
		return warehouseGrid;
	}

	public Set<Product> getProducts() {
		return products;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "warehouse_name")
    private String warehouseName;
    
    @Column(name = "warehouse_grid")
    private String warehouseGrid;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "warehouse")
    private Set<Product> products;    
    
    
    
}
