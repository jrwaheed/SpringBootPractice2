package com.example.SpringPractice2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path= "/demo")
public class MainController {

    @Autowired
    private PersonRepository personRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewPerson(@RequestParam String name, @RequestParam String email) {
        Person p = new Person();
        p.setName(name);
        p.setEmail(email);
        personRepository.save(p);
        return "Saved.";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable <Person> getAllPeople(){
        return personRepository.findAll();
    }

    @GetMapping(path="/list")
    public @ResponseBody List <Person> findAllPeopleAsList(){
        return personRepository.findAll();
    }
}
