package com.example.eaproject1.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestRegistrationEventDto {
    private Date startDate;
    private Date endDate;
    private List<Long> registrationGroup;
}
