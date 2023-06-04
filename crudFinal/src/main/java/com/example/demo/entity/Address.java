package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "state")
    private String state;

    @Column(name = "district", length = 30)
    private  String district;

    //Constructor
    public Address(){

    }
    public Address(Integer id, String state, String district) {
        this.id = id;
        this.state = state;
        this.district = district;
    }

    //Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
