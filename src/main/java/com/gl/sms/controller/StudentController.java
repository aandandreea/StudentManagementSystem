package com.gl.sms.controller;

import com.gl.sms.Student;
import com.gl.sms.service.StudentService;\]

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping("/add-student")
    public String createStudent(@RequestBody Student student){
        String message = studentService.addStudent(student);
        return message;
    }
    @GetMapping("/get-by-id/{id}")
    public Student getStudentById(@PathVariable Integer id) {
        return studentService.getStudentById(id).orElse(null);
    }
    @DeleteMapping("/delete-by-id/{id}")
    public String deleteStudentById(@PathVariable Integer id){
        return studentService.deleteStudentById(id);

    }
}
