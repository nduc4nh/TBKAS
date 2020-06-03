package com.example.demo.model.entity.OuterSystemEntity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "shop_orders")
public class ShopOrder
{
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    @OneToMany(mappedBy = "shopOrder")
    List<OrderProduct> orderProduct;
    @ManyToOne
    User user;
    Long price;
}