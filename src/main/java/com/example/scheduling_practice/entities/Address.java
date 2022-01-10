package com.example.scheduling_practice.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
    @Column(name = "addressId", nullable = false)
    private Long addressId;
    @Column(name = "postalCode", nullable = false)
    private String postalCode;
    @Column(name = "country")
    private String Country;
    @Column(name = "state")
    private String state;
    @Column(name = "city")
    private String city;
    @Column(name = "street")
    private String Street;
}
