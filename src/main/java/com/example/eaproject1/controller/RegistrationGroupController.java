package com.example.eaproject1.controller;

import com.example.eaproject1.domian.RegistrationGroup;
import com.example.eaproject1.service.RegistrationGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegistrationGroupController {

    @Autowired
    private RegistrationGroupService registrationGroupService;

    @GetMapping("/registrationGroup")
    public List<RegistrationGroup> getRegistrationGroup(){
        return registrationGroupService.getRegistratioGroup();
    }
    @GetMapping("/StudentRegistrationGroup")
    public RegistrationGroup getRegistrationGroup(Long studentId){
        return registrationGroupService.getRegistrationGroupByStudentId(studentId);
    }


}
