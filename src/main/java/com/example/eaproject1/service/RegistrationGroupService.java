package com.example.eaproject1.service;


import com.example.eaproject1.domian.RegistrationGroup;

import java.util.List;

public interface RegistrationGroupService {
    List<RegistrationGroup> getRegistrationGroup();
    RegistrationGroup getRegistrationGroupByStudentId(Long StudentId);

}
