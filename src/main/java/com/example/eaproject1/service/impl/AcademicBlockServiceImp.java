package com.example.eaproject1.service.impl;


import com.example.eaproject1.domian.AcademicBlock;
import com.example.eaproject1.repository.AcademicBlockRepository;
import com.example.eaproject1.service.AcademicBlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcademicBlockServiceImp implements AcademicBlockService {
    @Autowired
    private AcademicBlockRepository academicBlockRepository;
    @Override
    public List<AcademicBlock> getAll() {
        return academicBlockRepository.findAll();
    }

    @Override
    public AcademicBlock getById(long id) {
        return academicBlockRepository.findById(id).get();
    }

    @Override
    public void save(AcademicBlock academicBlock) {
        academicBlockRepository.save(academicBlock);
    }
}

