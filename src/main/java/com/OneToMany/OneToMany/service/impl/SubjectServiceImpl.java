package com.OneToMany.OneToMany.service.impl;

import com.OneToMany.OneToMany.entity.Subject;
import com.OneToMany.OneToMany.repository.SubjectRepository;
import com.OneToMany.OneToMany.service.SubjectService;
import org.springframework.stereotype.Service;

@Service
public class SubjectServiceImpl implements SubjectService {
    private final SubjectRepository subjectRepository;

    public SubjectServiceImpl(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @Override
    public Subject addSubject(Subject subject) {
        Subject subject1 = subjectRepository.save(subject);
        return subject1;
    }
}
