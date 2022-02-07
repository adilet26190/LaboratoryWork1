package com.in28minutes.learnspringboot.courses.bean;

import java.util.List;

public class Bank {
    private List<Account>account;

    public Bank(){

    }

    public Bank(List<Account>account){
        this.account=account;
    }
    public List<Account> getAccount() {
        return account;
    }

    public void setAccount(List<Account> account) {
        this.account = account;
    }

    public void withdraw(int pin,double cash){
        for(int i=0;i<account.size();i++) {
            if (account.get(i).getPin() == pin) {
                account.get(i).setCash(account.get(i).getCash() - cash);
            }
        }
    }

    public void topUp(int pin,double cash){
        for(int i=0;i<account.size();i++) {
            if (account.get(i).getPin() == pin) {
                account.get(i).setCash(account.get(i).getCash() + cash);
            }
        }
    }

    public void checkBalance(int pin){
        for(int i=0;i<account.size();i++) {
            if (account.get(i).getPin() == pin) {
                System.out.println("Current Balance of pin " + account.get(i).getPin() + ":" + account.get(i).show());
            }
        }
    }

    public void printInformation() {
        for (int i = 0; i < account.size(); i++) {
            System.out.println(account.get(i).show());
        }
    }
}
