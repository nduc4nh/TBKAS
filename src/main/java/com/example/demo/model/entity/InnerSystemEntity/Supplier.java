package com.example.demo.model.entity.InnerSystemEntity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.example.demo.model.entity.NeutralEntity.Admin;

@Entity(name = "suppliers")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id; 
    String address;
    @OneToMany(mappedBy = "supplier")
    List<SupplierOrder> order;
    @OneToOne
    SupplierProduct product;
    @OneToMany(mappedBy = "supplier")
    List<Admin> admin;
}