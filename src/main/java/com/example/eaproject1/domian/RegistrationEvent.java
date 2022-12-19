package com.example.eaproject1.domian;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public
class RegistrationEvent {
    @Id
    @GeneratedValue
    private long id;
    private Date startDate;
    private Date endDate;
    @OneToMany(mappedBy = "registrationEvent")
    private List<RegistrationGroup> registrationGroups;
}
