package com.example.demo.model.entity.InnerSystemEntity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity(name = "supplier_orders")
public class SupplierOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @OneToMany(mappedBy = "order")
    List<SupplierOrderProduct> orderProduct;
    @ManyToOne
    Supplier supplier;
    @ManyToOne
    Mall mall;
    Date createdOn;
    Date updatedOn;
    @OneToOne
    Schedule schedule;
    Boolean received;
}