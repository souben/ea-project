package com.example.eaproject1.domian;


import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Person {
    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

}