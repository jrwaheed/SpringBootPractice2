package com.example.SpringPractice2;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository <Person, Integer>{
    List<Person> findAll();

    List<Person> findByName(String name);
}
