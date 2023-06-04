package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "address_id",
            referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "FK_STUDENT_ADDRESS"))
    private Address address;

    //Constructors
    public Student(){

    }

    public Student(Integer id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }


    //Getters and Setters

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
