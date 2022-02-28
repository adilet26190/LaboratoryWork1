package com.example.lab3springboot.entity;


import javax.persistence.*;
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length =128,nullable = false,unique = true)
    private String pincode;

    private float cash;

    @ManyToOne
    @JoinColumn(name = "bank_id")
    private Bank bank;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public void setCash(float cash) {
        this.cash = cash;
    }

    public float getCash() {
        return cash;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
