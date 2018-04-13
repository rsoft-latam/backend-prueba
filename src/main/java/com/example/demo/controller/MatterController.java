package com.example.demo.controller;


import com.example.demo.model.Matter;
import com.example.demo.repository.MatterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/matter")
public class MatterController {

    @Autowired
    MatterRepository matterRepository;

    @GetMapping(path = "/add")
    public @ResponseBody
    String addNewMatter(
            @RequestParam String name,
            @RequestParam String initials,
            @RequestParam String description) {
        Matter matter = new Matter();
        matter.setName(name);
        matter.setInitials(initials);
        matter.setDescription(description);
        matterRepository.save(matter);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Matter> getAllMatters() {
        return matterRepository.findAll();
    }
}
