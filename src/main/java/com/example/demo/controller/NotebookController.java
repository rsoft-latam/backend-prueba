package com.example.demo.controller;

import com.example.demo.model.Note;
import com.example.demo.model.Notebook;
import com.example.demo.repository.NotebookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/notebook")
public class NotebookController {

    @Autowired
    private NotebookRepository notebookRepository;

    @GetMapping(path = "/add")
    public @ResponseBody
    String addNewNotebook(
            @RequestParam String name,
            @RequestParam String type,
            @RequestParam List<Note> notes) {
        Notebook notebook = new Notebook();
        notebook.setName(name);
        notebook.setType(type);
        notebook.setNotes(notes);
        notebookRepository.save(notebook);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Notebook> getAllNotebooks() {
        return notebookRepository.findAll();
    }
}
