package com.in28minutes.learnspringboot;

import com.in28minutes.learnspringboot.courses.bean.Account;
import com.in28minutes.learnspringboot.courses.bean.Bank;
//import com.in28minutes.learnspringboot.courses.bean.Course;
import com.in28minutes.learnspringboot.courses.controller.atm;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class LearnSpringBootApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringBootApplication.class, args);
		Scanner in = new Scanner(System.in);
		Account account = new Account(12L, 12, 300);
		Account account2 = new Account(12L, 13, 300);
		List<Account> accounts = new ArrayList<>();
		accounts.add(account);
		accounts.add(account2);
		Bank b = new Bank();
		b.setAccount(accounts);
		atm atm1 = new atm(b);

			while(true) {
				atm1.start();
			}

	}

}
