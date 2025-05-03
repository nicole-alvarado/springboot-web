package com.nicole.curso.springboot.myapp.springboot_web.models;

public class User {

    private String name;
    private String secondName;
    private String lastname;
    
    public User(String name, String secondName, String lastname) {
        this.name = name;
        this.secondName = secondName;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSecondName() {
        return secondName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
}
