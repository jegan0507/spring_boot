package com.sgic.lms.services;


import com.sgic.lms.Entity.Student;

import com.sgic.lms.repository.studentrepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class studentservice {
    @Autowired
    private  final   studentrepository repository;

    public Student SavStudent(Student student){
        return repository.save(student);

    }

    public List<Student> getAllStudents(){

        return repository.findAll();
    }

    public Student getStudentById(Long id){
        return repository.findById(id).orElse(null);
    }
    public Student updateStudent(long id, Student updated) {
        Student existing = getStudentById(id);
        existing.setName(updated.getName());
        existing.setAddress(updated.getAddress());
        return repository.save(existing);
    }

    public void deleteStudent(long id) {
        repository.deleteById(id);
    }
}
