package com.example.demo.model.entity.NeutralEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.example.demo.model.entity.InnerSystemEntity.MallProduct;
import com.example.demo.model.entity.InnerSystemEntity.SupplierProduct;
import com.example.demo.model.entity.OuterSystemEntity.ShopProduct;

@Entity(name = "products")
public class Product {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String name;
    Long price;
    String description; 
    @OneToOne
    SupplierProduct supplierProduct;
    @OneToOne
    MallProduct mallProduct;
    @OneToOne
    ShopProduct shopProduct;
}