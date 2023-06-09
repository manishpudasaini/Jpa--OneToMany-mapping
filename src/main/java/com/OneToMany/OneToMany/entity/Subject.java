package com.OneToMany.OneToMany.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.engine.internal.Cascade;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "jpa_subject")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int subject_id;
    private String subject_name;
    private String price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id",
            referencedColumnName = "student_id")
    @JsonBackReference
    private Student student;

}
