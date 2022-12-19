package com.example.eaproject1.DTO;

import com.example.eaproject1.domian.Registration;
import com.example.eaproject1.domian.RegistrationRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestCourseOfferingDto {
    private String code;

    private Long course;

    private Long faculty;

    private Long block;

    //will be modified
    private List<Registration> registrations;

    private List<RegistrationRequest> registrationRequests;
    private int capacity;
    private int availableSeats;
}
