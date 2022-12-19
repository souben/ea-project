package com.example.eaproject1.service;

import com.example.eaproject1.domian.AcademicBlock;

import java.util.List;

public interface AcademicBlockService {
    List<AcademicBlock> getAll();

    AcademicBlock getById(long id);

    void save(AcademicBlock academicBlock);
}
