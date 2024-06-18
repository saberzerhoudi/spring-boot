package de.uni_passau.studentcourse.course;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository
public class CourseRepository {

    public static final List<Course> courses = new ArrayList<>();

    // Add a course to the repository
    public void addCourse(Course course) {
        courses.add(course);
    }

    // Get a course by its ID
    public Optional<Course> getCourse(String courseId) {
        return courses.stream()
                .filter(course -> Objects.equals(course.getId(), courseId))
                .findFirst();
    }

    // Get all courses
    public List<Course> getAllCourses() {
        return new ArrayList<>(courses);
    }
}
