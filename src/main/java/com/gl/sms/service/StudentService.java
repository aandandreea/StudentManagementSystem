package com.gl.sms.service;

import com.gl.sms.Student;
import com.gl.sms.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public String addStudent(Student student){
        studentRepository.save(student);
        return "Student addded successfully";
    }
    public  Optional<Student> getStudentById(Integer id){
        return studentRepository.findById(id);
    }
    public String updateStudent(Student student){
        studentRepository.save(student);
        return "Student updated successfully";
    }
    public String deleteStudentById(Integer id){
        studentRepository.deleteById(id);
        return "Student deleted successfully";
    }
}
