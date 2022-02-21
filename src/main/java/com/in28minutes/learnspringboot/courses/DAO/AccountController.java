package com.in28minutes.learnspringboot.courses.DAO;

import com.in28minutes.learnspringboot.courses.bean.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/accounts")
    public List<Account> findAll() {
        return accountRepository.findAll();
    }
}
