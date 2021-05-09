package com.jmmc.myslot.repository;

import com.jmmc.myslot.data.Student;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {}
