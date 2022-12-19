package com.example.eaproject1.service.impl;


import com.example.eaproject1.DTO.RequestRegistrationEventDto;
import com.example.eaproject1.domian.RegistrationEvent;
import com.example.eaproject1.domian.RegistrationGroup;
import com.example.eaproject1.repository.RegistrationEventRepository;
import com.example.eaproject1.repository.RegistrationGroupRepository;
import com.example.eaproject1.service.RegistrationEventService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class RegistrationEventServiceImp implements RegistrationEventService {
    @Autowired
    private RegistrationEventRepository registrationEventRepository;
    @Autowired
    private RegistrationGroupRepository registrationGroupRepository;
    @Override
    public List<RegistrationEvent> getRegistrationEvent() {
        return registrationEventRepository.findAll();
    }

    @Override
    public RegistrationEvent getLatestRegistrationEvent() {
        return registrationEventRepository.findOrderedByStartDate();
    }

    @Override
    public void createRegistrationEvent(RequestRegistrationEventDto requestRegistrationEventDto) {
        List<RegistrationGroup> registrationGroupList = new ArrayList<>();
        for (Long id : requestRegistrationEventDto.getRegistrationGroup()){
            registrationGroupList.add(registrationGroupRepository.findById(id).get());
        }

        RegistrationEvent registrationEvent = RegistrationEvent.builder()
                .startDate(requestRegistrationEventDto.getStartDate())
                .endDate(requestRegistrationEventDto.getEndDate())
                .registrationGroups(registrationGroupList)
                .build();
        registrationEventRepository.save(registrationEvent);
    }

    @Override
    public void updateRegistrationEvent(long id, RegistrationEvent registrationEvent) {

        try {
            RegistrationEvent registrationEvent1 = registrationEventRepository.findById(id).orElse(null);
            if (registrationEvent1 != null){
                registrationEvent1.setEndDate(registrationEvent.getEndDate());
                registrationEvent1.setStartDate(registrationEvent.getStartDate());
                registrationEventRepository.save(registrationEvent1);
            }
        }catch (Exception e){
            log.error(e.getMessage());
        }

    }

    @Override
    public void deleteRegistrationEvent(long id) {
        registrationEventRepository.deleteById(id);
    }

    @Override
    public RegistrationEvent findRegistrationEventById(long id) {
        return registrationEventRepository.findById(id).orElse(null);
    }

}
