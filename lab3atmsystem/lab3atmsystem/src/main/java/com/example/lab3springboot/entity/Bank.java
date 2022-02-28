package com.example.lab3springboot.entity;

import javax.persistence.*;

@Entity
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45,nullable = false,unique = true)
    private String name;

    public Bank(Integer id){
        this.id=id;
    }
    public Bank(String name){
        this.name = name;
    }

    public Bank(){}

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
