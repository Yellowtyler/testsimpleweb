package com.example.simpleweb.domain;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String email;


    public Users(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public  Users()
    {

    }
}
//getters and setters
