package com.in28minutes.learnspringboot.courses.DAO;

import com.in28minutes.learnspringboot.courses.bean.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountDAO implements AccountRepository {
    @Autowired
    JdbcTemplate jdbc;

    @Override
    public List<Account> findAll() {
        return jdbc.query("SELECT * FROM students", new BeanPropertyRowMapper<Account>(Account.class));
    }

}
