package de.uni_passau.studentcourse.person;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

//    public Person getPersonById(Long id) {
//        return personRepository.findById(id).orElseThrow(() -> new RuntimeException("Person not found"));
//    }

    public PersonDto getPersonById(Long id) {
        return personRepository.findById(id)
                .map(PersonDtoMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("Person not found"));
    }
}
