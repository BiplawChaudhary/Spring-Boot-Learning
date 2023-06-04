package com.swagger.swaggerpractice.entity;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "district")
    private String district;

    @Column(name = "state")
    private Integer state;

    //Cnstuctor
    public Address(){

    }

    public Address(Integer id, String district, Integer state) {
        this.id = id;
        this.district = district;
        this.state = state;
    }

    //Getters and Setters


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
