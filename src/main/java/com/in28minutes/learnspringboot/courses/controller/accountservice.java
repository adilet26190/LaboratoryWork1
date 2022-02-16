package com.in28minutes.learnspringboot.courses.controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.*;

public class accountservice {
//        implements InitializingBean, DisposableBean {

    private String dbUrl;
    private String dbUsername;
    private String dbPassword;

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        this.init();
//    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    @PostConstruct
    // public void init() {
    //
    //}

    public void init() throws Exception {
        select();
    }


    public void select() throws Exception, SQLException {
        try {
            String driver = "org.postgresql.Driver";
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(this.dbUrl, this.dbUsername, this.dbPassword);
            Statement statement = connection.createStatement();

            //statement.setString(1, id);
            ResultSet resultSet = statement.executeQuery("SELECT * from students");
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String email = resultSet.getString(3);

                System.out.println("id: " + id + "name: " + name + "email: " + email + "\t");
            }
            // init connection

            System.out.println("UserService.createDbConnection" + resultSet);
        } catch (Exception e) {
            // ??? What should be done
            System.out.println(e);
        }

    }


    //    @Override
    @PreDestroy
    public void destroy() {
        this.closeConnections();
    }

    public void closeConnections() {
        System.out.println("UserService.closeConnections");
    }
}
