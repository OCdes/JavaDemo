package com.example.demo.vcs;


import lombok.Data;

import java.io.Serializable;
@Data
public class User implements Serializable {
    private String name;
    private String password;
    public User(String n, String ps) {
        this.name = n;
        this.password = ps;
    }


}
