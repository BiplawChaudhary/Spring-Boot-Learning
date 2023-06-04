package com.dependency.dependencyPractice.pojo;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "price", length = 6)
    private Integer price;

    @Column(length = 50)
    private String name;

    //---Setters
    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }


    //--Constuctor

    public Books(Integer price, String name) {
        this.price = price;
        this.name = name;
    }


    //--Getters

    public Integer getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
