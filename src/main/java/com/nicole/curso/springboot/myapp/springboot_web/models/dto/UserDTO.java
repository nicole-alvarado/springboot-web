package com.nicole.curso.springboot.myapp.springboot_web.models.dto;

import com.nicole.curso.springboot.myapp.springboot_web.models.User;

// Un DTO es un objeto simple de Java con atributos y métodos getters y setters
public class UserDTO {

    private String title;
    private User user;
    // private String name;
    // private String lastname;

    // public String getName() {
    //     return name;
    // }
    // public void setName(String name) {
    //     this.name = name;
    // }
    // public String getLastname() {
    //     return lastname;
    // }
    // public void setLastname(String lastname) {
    //     this.lastname = lastname;
    // }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }



}
