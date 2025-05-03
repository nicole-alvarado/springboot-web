package com.nicole.curso.springboot.myapp.springboot_web.models;

public class User {

    private String name;
    private String secondName;
    private String lastname;
    private String email;

    public User(String name, String secondName, String lastname) {
        this.name = name;
        this.secondName = secondName;
        this.lastname = lastname;
    }

    
    public User(String name, String secondName, String lastname, String email) {
        this.name = name;
        this.secondName = secondName;
        this.lastname = lastname;
        this.email = email;
    }


    // Constructor sin segundo nombre ni email
    public User(String name, String lastname) {
        this.name = name;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
