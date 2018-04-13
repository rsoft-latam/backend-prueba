package com.example.demo.controller;

import com.example.demo.model.Course;
import com.example.demo.model.Note;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/note")
public class NoteController {

    @Autowired
    private NoteRepository noteRepository;

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Note> getAllNotes() {
        return noteRepository.findAll();
    }
}
