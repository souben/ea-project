package com.example.eaproject1.service.impl;

import com.example.eaproject1.domian.RegistrationGroup;
import com.example.eaproject1.repository.RegistrationGroupRepository;
import com.example.eaproject1.service.RegistrationGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class RegistrationGroupServiceImp implements RegistrationGroupService {

    @Autowired
    private RegistrationGroupRepository registrationGroupRepository;


    @Override
    public List<RegistrationGroup> getRegistrationGroup() {
        return registrationGroupRepository.findAll();
    }

    @Override
    public RegistrationGroup getRegistrationGroupByStudentId(Long studentId) {

        return registrationGroupRepository.getStudentRegistrationGroup(studentId);


    }

}
