package com.jmmc.myslot.controller;

import com.jmmc.myslot.data.Student;
import com.jmmc.myslot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> findAll(){
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Student findById(@PathVariable String id){
        return studentService.findById(id);
    }

    @PostMapping
    public Student create(@RequestBody Student student){
        return studentService.save(student);
    }

    @PutMapping("/{id}")
    public Student update(@RequestBody Student student){
        return studentService.save(student);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id){
        studentService.deleteById(id);
    }
}
