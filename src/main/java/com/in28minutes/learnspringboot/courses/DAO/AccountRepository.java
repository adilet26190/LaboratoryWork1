package com.in28minutes.learnspringboot.courses.DAO;

import com.in28minutes.learnspringboot.courses.bean.Account;

import java.util.List;

public interface AccountRepository {
   List<Account> findAll();
   //  Account findOne(int id);
   //  Account save(Account Account);
}
