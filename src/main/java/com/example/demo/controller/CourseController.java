package com.example.demo.controller;

import com.example.demo.model.Course;
import com.example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/course")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Course> getAllCourses() {
        return courseRepository.findAll();
    }
}
