package com.example.eaproject1.domian;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public
class AcademicBlock {
  @Id
  @GeneratedValue
    private Long id;
    private String code;
    private String name;
    private Semester semester;
    @Temporal(TemporalType.DATE)
    private Date startDate;
   @Temporal(TemporalType.DATE)
    private Date endDate;

    @OneToMany(mappedBy = "block")
    private List<CourseOffering> courseOfferings;
//    @ManyToMany(mappedBy = "blocks")
//    private List<RegistrationGroup> registrationGroups;


}
