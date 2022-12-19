package com.example.eaproject1.domian;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AppUser {
    @Id
    @GeneratedValue
    private long id;
    private String name;
}
