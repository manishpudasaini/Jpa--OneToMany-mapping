package com.OneToMany.OneToMany.repository;

import com.OneToMany.OneToMany.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject,Integer> {
}
