package com.in28minutes.learnspringboot;

import com.in28minutes.learnspringboot.courses.bean.Account;
import com.in28minutes.learnspringboot.courses.bean.Bank;
import com.in28minutes.learnspringboot.courses.controller.atm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


@SpringBootApplication
public class LearnSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringBootApplication.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Scanner in = new Scanner(System.in);
		Account account = new Account(12, 12, 300);
		Account account2 = new Account(12, 13, 300);
		List<Account> accounts = new ArrayList<>();
		accounts.add(account);
		accounts.add(account2);
		Bank b = new Bank();
		b.setAccount(accounts);
		atm atm1 = new atm(b);
		((ClassPathXmlApplicationContext) context).close();
		atm1.start();


	}

}
