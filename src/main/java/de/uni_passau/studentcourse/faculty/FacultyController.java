package de.uni_passau.studentcourse.faculty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/faculty")
public class FacultyController {

    @Autowired
    private FacultyService facultyService;

    @GetMapping("/{title}")
    public Faculty getFacultyDetails(@PathVariable String title) {
        return facultyService.getFacultyByTitle(title)
                .orElseThrow(() -> new RuntimeException("Faculty not found"));
    }
}
