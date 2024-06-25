package de.uni_passau.studentcourse.faculty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class FacultyService {

    @Autowired
    private FacultyRepository facultyRepository;

    public Optional<Faculty> getFacultyByTitle(String title) {
        return Optional.ofNullable(facultyRepository.findByTitle(title));
    }
}
