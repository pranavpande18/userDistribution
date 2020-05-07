package com.demoapp.demo.model;

import javax.persistence.*;

@Entity
public class UserType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column
    private UserTypes userType;

    public UserType(){

    }

    public UserType(UserTypes userType){
        this.userType = userType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserTypes getUserTypes() {
        return userType;
    }

    public void setUserTypes(UserTypes userTypes) {
        this.userType = userTypes;
    }
}