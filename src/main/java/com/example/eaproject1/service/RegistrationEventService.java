package com.example.eaproject1.service;



import com.example.eaproject1.DTO.RequestRegistrationEventDto;
import com.example.eaproject1.domian.RegistrationEvent;

import java.util.List;

public interface RegistrationEventService {
    List<RegistrationEvent> getRegistrationEvent();

    RegistrationEvent getLatestRegistrationEvent();

    void createRegistrationEvent(RequestRegistrationEventDto requestRegistrationEventDto);

    void updateRegistrationEvent(long id, RegistrationEvent registrationEvent);

    void deleteRegistrationEvent(long id);

    RegistrationEvent findRegistrationEventById(long id);

}
