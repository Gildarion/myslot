package com.jmmc.myslot.service;

import java.util.List;

import com.jmmc.myslot.data.Student;
import com.jmmc.myslot.exception.EntityNotFoundException;
import com.jmmc.myslot.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    public Student findById(String id) {
        return studentRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public Student save(Student student){
        return studentRepository.save(student);
    }

    public void deleteById(String id){
        studentRepository.deleteById(id);
    }
}