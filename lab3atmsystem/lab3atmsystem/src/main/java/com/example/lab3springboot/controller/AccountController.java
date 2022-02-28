package com.example.lab3springboot.controller;
import com.example.lab3springboot.Repo.*;
import com.example.lab3springboot.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AccountController {
    @Autowired
    private AccountRepo accountRepo;
    @Autowired
    private BankRepo bankRepo;

    @GetMapping("/accounts")
    public String showAccount(Model model){
        List<Account>AccountList = accountRepo.findAll();
        model.addAttribute("Accountlist",AccountList);
        return "accounts";
    }

    @GetMapping("/accounts/new")
    public String showNewAccountForm(Model model){
        List<Bank>BankList = bankRepo.findAll();
        model.addAttribute("account",new Account());
        model.addAttribute("BankList",BankList);
        return "accounts_form";
    }

    @PostMapping("/accounts/save")
    public String saveAccount(Account account){
        accountRepo.save(account);
        return "redirect:/accounts";
    }

    @GetMapping("accounts/edit/{id}")
    public String showEditProductForm(@PathVariable("id") Integer id, Model model){
        Account account=accountRepo.findById(id).get();
        model.addAttribute("account",account);
        List<Bank>BankList = bankRepo.findAll();
        model.addAttribute("BankList",BankList);
        return "accounts_form";
    }
}
