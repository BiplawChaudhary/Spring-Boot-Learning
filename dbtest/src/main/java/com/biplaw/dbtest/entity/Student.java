package com.biplaw.dbtest.entity;

import javax.persistence.*;


//Maps the class to the entity
@Entity
//If run like this the Student table will be created
//To manupulate the table like it's name
@Table(name="student_data")
public class Student {

    //Makes the PK
    @Id
    //Generating the ID automatically
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    //Changing the definitions of columns
    @Column(length = 20, name="student_name")
    private String name;

    //Getters-------------------

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    //Setters------------------

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    //Constructor---------
    public Student(){
    }
    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }


}
