package com.demoapp.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.Id;

@Document
public class Patient {

    @Id
    String id;
    String name;
    String condition;

    public Patient(String name, String condition)
    {
        this.name = name;
        this.condition = condition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
