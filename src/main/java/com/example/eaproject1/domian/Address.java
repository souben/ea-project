package com.example.eaproject1.domian;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue
    private int id;
    private String street;
    private String city;
    private String postalCode;
    private String stateProvince;
    private String countryRegion;
//    @OneToMany
//           (mappedBy = "homeAddress", fetch = FetchType.EAGER)
//    private List<Student> students;



}