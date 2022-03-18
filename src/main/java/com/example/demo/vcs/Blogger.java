package com.example.demo.vcs;

import lombok.Data;

@Data
public class Blogger {
    private Long id;
    private String name;
    private String pass;

    public Blogger(Long id, String name, String pass) {
        this.id = id;
        this.name = name;
        this.pass = pass;
    }
}
