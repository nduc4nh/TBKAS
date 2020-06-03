package com.example.demo.model.entity.InnerSystemEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "supplier_order_products")
public class SupplierOrderProduct {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    @ManyToOne
    SupplierOrder order;
    @ManyToOne
    SupplierProduct product;
    Long quantity;
}