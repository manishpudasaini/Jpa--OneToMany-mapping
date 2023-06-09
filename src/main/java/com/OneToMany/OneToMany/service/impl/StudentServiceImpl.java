package com.OneToMany.OneToMany.service.impl;

import com.OneToMany.OneToMany.entity.Student;
import com.OneToMany.OneToMany.repository.StudentRepository;
import com.OneToMany.OneToMany.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student){
        Student student1 = studentRepository.save(student);
        return student1;
    }

    @Override
    public Student getStudent(int id) {
        return studentRepository.findById(id).get();
    }

}
