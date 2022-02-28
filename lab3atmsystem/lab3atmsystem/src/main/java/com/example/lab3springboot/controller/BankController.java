package com.example.lab3springboot.controller;
import com.example.lab3springboot.Repo.BankRepo;
import com.example.lab3springboot.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BankController {

    @Autowired
    private BankRepo bankRepo;

    @GetMapping("/banks")
    public String Banklist(Model model){
        List<Bank>BankList =bankRepo.findAll();
        model.addAttribute("BankList",BankList);
        return "banks";
    }

    @GetMapping("/banks/new")
    public String showBankNewForm(Model model){
        model.addAttribute("bank", new Bank());
        return "bank_form";
    }

    @PostMapping("/banks/save")
    public String saveBank(Bank bank){
        bankRepo.save(bank);
        return "redirect:/banks";

    }
}