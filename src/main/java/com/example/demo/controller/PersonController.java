package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/person")
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping(path = "/add")
    public @ResponseBody
    String addNewPerson(
            @RequestParam Integer ci,
            @RequestParam String name,
            @RequestParam String last_name_father,
            @RequestParam String last_name_mother,
            @RequestParam String sex,
            @RequestParam String birthdate,
            @RequestParam String nationality,
            @RequestParam String address,
            @RequestParam Integer phone) {
        Person person = new Person();
        person.setCi(ci);
        person.setName(name);
        person.setLast_name_father(last_name_father);
        person.setLast_name_mother(last_name_mother);
        person.setSex(sex);
        person.setBirthdate(birthdate);
        person.setNationality(nationality);
        person.setAddress(address);
        person.setPhone(phone);
        personRepository.save(person);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Person> getAllPersons() {
        return personRepository.findAll();
    }
}
