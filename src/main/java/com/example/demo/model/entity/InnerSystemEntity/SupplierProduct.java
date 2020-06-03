package com.example.demo.model.entity.InnerSystemEntity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.example.demo.model.entity.NeutralEntity.Product;

@Entity(name = "supplier_products")
public class SupplierProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @OneToOne(mappedBy = "supplierProduct")
    Product product;
    @OneToMany(mappedBy = "product")
    List<SupplierOrderProduct> order;
    Long quantity;
    @ManyToOne
    Supplier supplier;
}