package com.in28minutes.learnspringboot.courses.bean;

//AccountDAO
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Data


public class Account {

    private int id;
    private int pin;
    private double cash;


      public Account(int id, int pin, double cash){
          this.id = id;
          this.pin=pin;
          this.cash=cash;

      }


    public Account(){}

    public String show() {
        return ("Account{" +
                "id=" + id +
                ", pin='" + pin + '\'' +
                ", cash='" + cash + '\'' +
                '}');

    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
