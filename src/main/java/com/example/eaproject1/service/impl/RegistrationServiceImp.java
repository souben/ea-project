package com.example.eaproject1.service.impl;

import com.example.eaproject1.domian.Registration;
import com.example.eaproject1.repository.RegistrationServiceRepository;
import com.example.eaproject1.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RegistrationServiceImp implements RegistrationService {

    @Autowired
    RegistrationServiceRepository registrationRepository;


    @Override
    public List<Registration> getAllRegistrationService() {
        return registrationRepository.findAll();
    }
}
