package com.swagger.controller;

import com.swagger.model.PersonDetails;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/swagger")
public class SwaggerController {

    Map<Integer, PersonDetails> personMap = new HashMap<>();

    @PostMapping(path = "/create")
    public Map createPersonData(@RequestBody PersonDetails person) {
        personMap.put(person.getId(), person);
        return personMap;
    }

    @GetMapping("/getAll")
    public Map getAllPersonsData() {
        return personMap;
    }

    @PutMapping("/updatePerson")
    public Map updatePersonData(@RequestBody PersonDetails person) {
        List<PersonDetails> personList = new ArrayList<>(personMap.values());
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId() == person.getId()) {
                personMap.put(person.getId(), person);
            }
        }
        return personMap;
    }


}