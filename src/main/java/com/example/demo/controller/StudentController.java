package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/student")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping(path = "/add")
    public @ResponseBody
    String addNewStudent(
            @RequestParam Integer person_code,
            @RequestParam String enrrollment,
            @RequestParam String type) {
        Student student = new Student();
        student.setPerson_code(person_code);
        student.setEnrollment(enrrollment);
        student.setType(type);
        studentRepository.save(student);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
