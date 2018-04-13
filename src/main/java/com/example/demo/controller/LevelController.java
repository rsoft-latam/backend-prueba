package com.example.demo.controller;

import com.example.demo.model.Course;
import com.example.demo.model.Level;
import com.example.demo.repository.LevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@Controller
@RequestMapping(path = "/level")
public class LevelController {

    @Autowired
    private LevelRepository levelRepository;

    @GetMapping(path = "/add")
    public @ResponseBody
    String addNewMatter(
            @RequestParam String name,
            @RequestParam String type,
            @RequestParam List<Course> courses) {
        Level level = new Level();
        level.setName(name);
        level.setType(type);
        level.setCourses(courses);
        levelRepository.save(level);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Level> getAllMatters() {
        return levelRepository.findAll();
    }
    /*@RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody Object getAllLevel2()
    {
        Map<String,Object> obj = new HashMap<>();
        obj.put("name",'s');
        obj.put("type",'s');
        obj.put("courses",'s');
        return obj;
    }*/
}