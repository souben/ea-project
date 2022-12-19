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
public class RegistrationRequest {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    private Student student;
    @ManyToOne
    private CourseOffering courseOffering;
    private int priorityNumber;
}
