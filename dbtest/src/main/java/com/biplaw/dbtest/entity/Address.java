package com.biplaw.dbtest.entity;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="state", length = 50)
    private String state;

    @Column(name="district", length = 50)
    private String district;

    //--Getters

    public Integer getId() {
        return id;
    }

    public String getState() {
        return state;
    }

    public String getDistrict() {
        return district;
    }

    //--Setters

    public void setId(Integer id) {
        this.id = id;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Address(){}

    //--Constructors


    public Address(Integer id, String state, String district) {
        this.id = id;
        this.state = state;
        this.district = district;
    }
}
