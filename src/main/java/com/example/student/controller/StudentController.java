package com.example.student.controller;


import com.example.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController

public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/student/get/{id}")
    public ResponseEntity<?> getStudent(@PathVariable Integer id){
            return ResponseEntity.of(Optional.of(studentService.findStudentBYId(id)));

    }
    @GetMapping("/student/get")
    public ResponseEntity<?> getStudent(){
            return ResponseEntity.of(Optional.of(studentService.findAllStudent()));
    }

}
