package com.sgic.lms.controler;


import com.sgic.lms.Entity.Student;
import com.sgic.lms.services.studentservice;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Student")
public class apis {
    @Autowired
    private final studentservice services;

    @PostMapping
    public Student addStudent (@RequestBody Student student){
        return  services.SavStudent(student);
    }

    @GetMapping
    public List<Student> getAllstudent(){
        return  services.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable long id) {
        return services.getStudentById(id);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable long id, @RequestBody Student student) {
        return services.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable long id) {
        services.deleteStudent(id);
        return "Student deleted successfully";
    }


}
