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
public class Student extends Person {

    private String studentId;
    private String name;
    //private String email;
    //we will check this
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Address mailing;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   private Address homeAddress;
    @OneToMany(mappedBy = "student")
    private List<Registration> registrations;
//    @OneToMany
//    private List<RegistrationEvent> registrationEvent;
    @OneToMany
    private List<RegistrationRequest> registrationRequests;
}
