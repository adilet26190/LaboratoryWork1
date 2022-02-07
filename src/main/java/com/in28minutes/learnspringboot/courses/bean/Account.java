package com.in28minutes.learnspringboot.courses.bean;

import org.springframework.stereotype.Component;

@Component

public class Account {
    private Long id;
    private int pin;
    private double cash;


    public Account(){
        super();
        System.out.println("object created");
    }

    public Account(Long id,int pin,double cash){
        this.id=id;
        this.pin=pin;
        this.cash=cash;
    }
    public double getCash() {
        return cash;
    }

    public int getPin() {
        return pin;
    }

    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public String show() {
        return ("Account{" +
                "id=" + id +
                ", pin='" + pin + '\'' +
                ", cash='" + cash + '\'' +
                '}');

    }
}
