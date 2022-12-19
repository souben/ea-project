package com.example.eaproject1.controller;

import com.example.eaproject1.domian.AcademicBlock;
import com.example.eaproject1.service.AcademicBlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blocks")
public class AcademicBlockController {
    @Autowired
    private AcademicBlockService academicBlockService;

    @GetMapping
    public List<AcademicBlock> getAll(){
        return academicBlockService.getAll();
    }

    @GetMapping("/{id}")
    public AcademicBlock get(@PathVariable long id){
        return academicBlockService.getById(id);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody AcademicBlock academicBlock){
        academicBlockService.save(academicBlock);
        return new ResponseEntity<>("success", HttpStatus.CREATED);
    }
}
