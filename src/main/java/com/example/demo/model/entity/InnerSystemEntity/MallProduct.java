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

@Entity(name="mall_products")
public class MallProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @OneToOne(mappedBy = "mallProduct")
    Product product;
    /*@OneToMany(mappedBy = "mallProducts")
    List<SupplierOrder> orders;*/
    Long quantity;
    @ManyToOne
    Mall mall;
}