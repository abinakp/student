package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepository;
import com.example.demo.service.SequenceGeneratorService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;


@RestController

public class StudentController {

    @Autowired
    public StudentRepository studentRepository;
    
    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;

    @GetMapping(value = "/all")
    @CrossOrigin
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


    @PostMapping(value = "/create")
    @CrossOrigin
    public Student createStudent(@RequestBody Student student) {
        student.setId(sequenceGeneratorService.generateSequence(Student.SEQUENCE_NAME));
        String num = String.valueOf(student.getId());
    	student.setRegno("R-" + ("0000" + num).substring(num.length()));
    	return studentRepository.save(student);
    }
    
    
//    @PostMapping(value = "/create")
//    @CrossOrigin
//    public String createStudent(@RequestBody Student student) {
//        Student insertStudent = studentRepository.insert(student);
//        return "Student Created. "+ insertStudent.getName();
//    }
    
    
}