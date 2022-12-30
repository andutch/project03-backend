package com.project03.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="product_warehouse")
// @Data -- known bug
@Getter
@Setter
public class ProductWarehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "warehouse_name")
    private String warehouseName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "warehouse")
    private Set<Product> products;

}
