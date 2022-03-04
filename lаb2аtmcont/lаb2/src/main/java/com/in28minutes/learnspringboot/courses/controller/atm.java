package com.in28minutes.learnspringboot.courses.controller;

import com.in28minutes.learnspringboot.courses.bean.Account;
import com.in28minutes.learnspringboot.courses.bean.Bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atm {


    Bank b = new Bank();
    Scanner scanner = new Scanner(System.in);

    public atm(Bank b){
        this.b=b;
    }
    public void start() {

        System.out.println("Insert pin:");
        int pin=scanner.nextInt();
        int choice=-1;
        while (choice!=4) {
            System.out.println("1.Withdraw");
            System.out.println("2.TopUp");
            System.out.println("3.CheckBalance");
            System.out.println("4.Exit");
            choice=scanner.nextInt();

            if (choice == 1) {
              System.out.println("Enter cash:");
                double cash = scanner.nextDouble();
                b.withdraw(pin, cash);
            } else if (choice == 2) {
                System.out.println("Enter cash:");
                double cash = scanner.nextDouble();
                b.topUp(pin,cash);
            } else if (choice == 3) {
                b.checkBalance(pin);
            } else if(choice ==4){

                return;
            }

        }
    }
}
