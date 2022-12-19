package com.example.eaproject1.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseCourseOfferingDto {
    private int availableSeats;
    private String courseCode;
    private String courseName;
    private String facultyName;
    private String blockName;
    private String code;
    private int capacity;
    private Date startDate;
    private Date endDate;




}
