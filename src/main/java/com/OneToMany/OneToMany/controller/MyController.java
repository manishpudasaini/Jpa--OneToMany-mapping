package com.OneToMany.OneToMany.controller;

import com.OneToMany.OneToMany.entity.Student;
import com.OneToMany.OneToMany.entity.Subject;
import com.OneToMany.OneToMany.service.StudentService;
import com.OneToMany.OneToMany.service.SubjectService;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {
    private final StudentService studentService;

    public MyController(StudentService studentService, SubjectService subjectService) {
        this.studentService = studentService;
        this.subjectService = subjectService;
    }
    private final SubjectService subjectService;


    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student){
        Student student1 = studentService.addStudent(student);
        System.out.println(student);
        return student1;
    }

    @PostMapping("/subject")
    public Subject addSubject(@RequestBody Subject subject){
        Subject subject1 = subjectService.addSubject(subject);
        System.out.println(subject1);
        return subject1;
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable int id){
        return studentService.getStudent(id);
    }
}
