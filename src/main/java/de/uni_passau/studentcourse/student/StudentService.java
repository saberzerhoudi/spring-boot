package de.uni_passau.studentcourse.student;


import de.uni_passau.studentcourse.course.Course;
import de.uni_passau.studentcourse.course.CourseRepository;
import de.uni_passau.studentcourse.exception.MissingPrerequisiteException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository, CourseRepository courseRepository) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    public Optional<Student> getStudent(String matNr) {
        return studentRepository.getStudent(matNr);
    }

    public Optional<List<Course>> getCurrentlyAttendedCourses(String matNr) {
        Optional<Student> studentOptional = getStudent(matNr);
        return studentOptional.map(Student::getCurrentCourses);
    }

    public void registerStudentToCourse(String matNr, String courseId) {
        Student student = studentRepository.getStudent(matNr)
                .orElseThrow(() -> new IllegalArgumentException("Student not found"));
        Course course = courseRepository.getCourse(courseId)
                .orElseThrow(() -> new IllegalArgumentException("Course not found"));

        boolean prerequisitesMet = course.getPrerequisites().stream()
                .allMatch(prerequisite -> student.getCurrentCourses().contains(prerequisite));

        if (!prerequisitesMet) {
            throw new MissingPrerequisiteException("Not all prerequisites for the course are met.");
        }
        student.getCurrentCourses().add(course);
    }
}
