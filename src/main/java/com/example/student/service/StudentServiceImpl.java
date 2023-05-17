package com.example.student.service;

import com.example.student.dto.StudentDto;
import com.example.student.model.Student;
import com.example.student.repository.StudentRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;
    @Autowired
    ModelMapper mapper;
    @Override
    public List<StudentDto> findAllStudent() {
        TypeToken<List<StudentDto>> typeToken=new TypeToken<>(){};
        return mapper.map(studentRepository.findAll(),typeToken.getType());
    }
    @Override
    public StudentDto findStudentBYId(Integer id) {
        return mapper.map(studentRepository.findById(id), StudentDto.class);
    }
}
