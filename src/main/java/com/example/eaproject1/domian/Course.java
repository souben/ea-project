package com.example.eaproject1.domian;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course {
    @Id
    @GeneratedValue
    private Long id;
    private String code;
    private String name;
    private String description;
    @OneToMany
//            (mappedBy = "course")
    private List<CourseOffering> courseOfferings;


}
