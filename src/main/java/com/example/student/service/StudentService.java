package com.example.student.service;

import com.example.student.dto.StudentDto;
import com.example.student.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface StudentService {
    List<StudentDto> findAllStudent();
    StudentDto findStudentBYId(Integer id);
}
