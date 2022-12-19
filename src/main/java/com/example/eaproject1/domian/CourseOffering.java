package com.example.eaproject1.domian;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class CourseOffering {
    @Id
    @GeneratedValue
    private Long id;
    private String code;
    @ManyToOne
    private Course course;
    @ManyToOne
    @JsonBackReference
    private Faculty faculty;
    @ManyToOne
    private AcademicBlock block;
    @OneToMany(mappedBy = "courseOffering")
    private List<Registration> registrations;
    @OneToMany(mappedBy = "courseOffering")
    private List<RegistrationRequest> registrationRequests;
    private int capacity;
    @Transient
    private int availableSeats;

}
