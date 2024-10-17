package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


    @Autowired
    private  StudentRepo studentRepo;


    public List<Student> getStudents() {
        return  studentRepo.findAll();
    }

    public Student addStudents(Student student) {
        return studentRepo.save(student);
    }
    public List<Student> findAllStudentsBySchool(Integer schoolId) {
        return studentRepo.findAllBySchoolId(schoolId);
    }
}
