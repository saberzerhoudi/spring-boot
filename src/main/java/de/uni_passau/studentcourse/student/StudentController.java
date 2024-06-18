package de.uni_passau.studentcourse.student;

import de.uni_passau.studentcourse.course.Course;
import de.uni_passau.studentcourse.course.CourseDto;
import de.uni_passau.studentcourse.course.CourseDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import de.uni_passau.studentcourse.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("{matNr}")
    public StudentDto getStudent(@PathVariable("matNr") String matNr) {

        Optional<Student> student = studentService.getStudent(matNr);

        if (student.isPresent()) {
            return StudentDtoMapper.map(student.get());
        }

        System.out.println("Student not found, throwing exception");
        throw new ResourceNotFoundException("Student not found");

    }

    @GetMapping("/{matNr}/courses")
    public List<CourseDto> getCurrentlyAttendedCourses(@PathVariable("matNr") String matNr) {

        Optional<List<Course>> currentCoursesOptional = studentService.getCurrentlyAttendedCourses(matNr);

        if (currentCoursesOptional.isEmpty()) {
            System.out.println("Student not attending any courses, throwing exception");
            throw new ResourceNotFoundException("Student not attending any courses");
        }

        List<Course> currentCourses = currentCoursesOptional.get();
        return currentCourses.stream().map(CourseDtoMapper::map).collect(Collectors.toList());
    }

    @PostMapping("/{matNr}/courses/{cid}")
    @ResponseStatus(HttpStatus.CREATED)
    public void registerStudentForCourse(@PathVariable("matNr") String matNr, @PathVariable("cid") String courseId) {
        studentService.registerStudentToCourse(matNr, courseId);
    }
}

