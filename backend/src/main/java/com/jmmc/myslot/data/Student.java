package com.jmmc.myslot.data;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.annotation.Id;

public class Student {

    @Id
    private String id;
	private String name;
	private String surname;
	private Integer lessons;
	private Short balls;
    private Integer studyLessons;
    private String deadDate;
    private Float probSuccess;

    public Student(String name, String surname, Integer lessons, Short balls, Integer studyLessons, String deadDate){

        this.name = name;
        this.surname = surname;
        this.lessons = lessons;
        this.balls = balls;
        this.studyLessons = studyLessons;
        this.deadDate = deadDate;
        this.probSuccess = setProbSuccess(balls, lessons, studyLessons);
    }

    public String getId() {
        return id;
    }
    public List<String> getStudent() {

        List<String> student = new ArrayList<>();

        student.add(this.name);
        student.add(this.surname);
        student.add(this.deadDate);
        student.add(String.format("%.3f", this.probSuccess));

        return student;
    }

    private Float setProbSuccess(Short balls, Integer lessons, Integer studyLessons){

        float aux = 1;
        float up = 0, down = 0;

            for(int i=0;i<balls;i++) {
                up = lessons - studyLessons - i;
                down = lessons - i;
                aux *= up / down;
            }
        float totalProb = (1 - aux) * 100;
    
        return totalProb;
    }
}
