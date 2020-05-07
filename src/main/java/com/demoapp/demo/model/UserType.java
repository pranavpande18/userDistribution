package com.demoapp.demo.model;

import org.springframework.context.annotation.Lazy;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;

@Entity
public class UserType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column

    public UserTypes userType;

    public UserType(){

    }

    public UserType(String userType){
        System.out.println(userType);
        if(userType.equals(UserTypes.DOCTOR.name())){
            this.userType = UserTypes.DOCTOR;
        }else if(userType.equals(UserTypes.PATIENT.name())){
            this.userType = UserTypes.PATIENT;
        }
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