package com.example.demo.model.entity.OuterSystemEntity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "users")
public class User {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String username;
    String password;
    @OneToMany(mappedBy = "user")
    List<ShopOrder> order;
}