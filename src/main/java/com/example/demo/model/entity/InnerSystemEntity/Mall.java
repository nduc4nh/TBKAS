package com.example.demo.model.entity.InnerSystemEntity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.example.demo.model.entity.NeutralEntity.Admin;

@Entity(name = "malls")
public class Mall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id; 
    String address;
    @OneToMany(mappedBy = "mall")
    List<SupplierOrder> order;
    @OneToOne
    MallProduct product;
    @OneToMany(mappedBy = "mall")
    List<Admin> admin;
}