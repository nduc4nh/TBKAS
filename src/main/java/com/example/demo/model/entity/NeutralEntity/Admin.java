package com.example.demo.model.entity.NeutralEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.example.demo.model.entity.InnerSystemEntity.Mall;
import com.example.demo.model.entity.InnerSystemEntity.Supplier;

@Entity(name = "admins")
public class Admin {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String name;
    String password;
    String role;
    @ManyToOne
    Mall mall;
    @ManyToOne
    Supplier supplier;
}