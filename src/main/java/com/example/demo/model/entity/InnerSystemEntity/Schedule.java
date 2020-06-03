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


@Entity(name = "schedules")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    Supplier supplier;
    @ManyToOne
    Mall mall;
    @OneToOne
    SupplierOrder order;
    Date createdOn;
    Date updatedOn;
    Date arriveOn;
}