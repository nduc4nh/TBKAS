package com.example.demo.model.entity.OuterSystemEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "order_product")
public class OrderProduct {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    @ManyToOne
    ShopOrder shopOrder;
    @ManyToOne
    ShopProduct product;
    Long quantity;
}