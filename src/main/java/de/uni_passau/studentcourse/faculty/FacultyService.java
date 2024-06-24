package de.uni_passau.studentcourse.faculty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FacultyService {

    private final FacultyRepository facultyRepository;

    @Autowired
    public FacultyService(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public Optional<Faculty> getFacultyById(String id) {
        return facultyRepository.findById(id);
    }

    public Faculty saveFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public Optional<Faculty> getFacultyByTitle(String title) {
        return facultyRepository.findByTitle(title);
    }

}