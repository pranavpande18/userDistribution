package com.demoapp.demo.model;

import javax.persistence.*;

@Entity
public class User {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    Integer userID;

    @Column
    String name;

    @Column
    String age;

    @Column
    UserType userType;

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}