package com.sgic.lms.repository;

import com.sgic.lms.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentrepository extends JpaRepository<Student,Long> {
}