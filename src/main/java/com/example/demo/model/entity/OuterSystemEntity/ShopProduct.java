package com.example.demo.model.entity.OuterSystemEntity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.example.demo.model.entity.NeutralEntity.Product;



@Entity(name = "shop_products")
public class ShopProduct {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    @OneToOne
    Product product;
    @OneToMany(mappedBy = "product")
    List<OrderProduct> shopOrder;
    Long quantity;
}