package com.demoapp.demo.model;


import com.sun.xml.internal.ws.util.QNameMap;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.Id;

@Document()
public class Doctor {
    @Id
    String id;
    String name;
    String degree;

    public Doctor(String name, String degree)
    {
        this.name = name;
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
