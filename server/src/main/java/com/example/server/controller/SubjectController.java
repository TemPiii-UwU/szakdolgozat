package com.example.server.controller;

import com.example.server.domain.Subject;
import com.example.server.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubjectController {


    @Autowired
    private SubjectRepository subjectRepository;

    @GetMapping("/")
    public List<Subject> teszt(){
        Subject teszt = new Subject("testnevelés");
        subjectRepository.save(teszt);
        return subjectRepository.findAll();
    }

}
