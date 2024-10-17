package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
        @RequestMapping("/api/student")
public class studentController {

    @Autowired
    private  StudentService studentService;


    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        Student student1 = studentService.addStudents(student);
       return new  ResponseEntity<>(student1, HttpStatus.CREATED);

    }
    @GetMapping("/school/{school-id}")
    public ResponseEntity<List<Student>> findAllStudents(@PathVariable("school-id") Integer schoolId) {
        return ResponseEntity.ok(studentService.findAllStudentsBySchool(schoolId));
    }

}
