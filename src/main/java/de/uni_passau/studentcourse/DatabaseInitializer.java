package de.uni_passau.studentcourse;

import de.uni_passau.studentcourse.course.Course;
import de.uni_passau.studentcourse.student.Student;
import de.uni_passau.studentcourse.student.StudentRepository;
import de.uni_passau.studentcourse.course.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class DatabaseInitializer implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        // Initializes the data of our model
        Course course0 = new Course("c0", "JSF", "Learn JSF.", null);
        Course course1 = new Course("c1", "Maven", "One of the most popular dependency management tools.", null);
        Course course2 = new Course("c2", "Web Servers", "Learn about web servers.", null);

        List<Course> courseList0 = new LinkedList<>();
        courseList0.add(course1);
        courseList0.add(course2);
        Course course3 = new Course("c3", "Spring Boot", "Use Spring Boot to bootstrap servers.", courseList0);

        List<Course> courseList1 = new LinkedList<>(courseList0);
        courseList1.add(course3);
        Course course4 = new Course("c4", "Spring Data", "A course about data persistence on the server.", courseList1);

        CourseRepository.courses.add(course0);
        CourseRepository.courses.add(course1);
        CourseRepository.courses.add(course2);
        CourseRepository.courses.add(course3);
        CourseRepository.courses.add(course4);

        List<Course> courseList2 = new LinkedList<>();
        courseList2.add(course0);
        courseList2.add(course1);

        List<Course> courseList3 = new LinkedList<>();
        courseList3.add(course3);

        List<Course> courseList4 = new LinkedList<>();
        courseList4.add(course0);

        Student student0 = new Student(1L, "23328", "Max", "Muster", courseList2, null);
        Student student1 = new Student(2L, "34622", "Hans", "Muster", courseList3, courseList0);
        Student student2 = new Student(3L, "48645", "Alice", "Klint", courseList4, courseList0);
        Student student3 = new Student(4L, "24232", "Bob", "Ser", null, courseList1);

        StudentRepository.students.add(student0);
        StudentRepository.students.add(student1);
        StudentRepository.students.add(student2);
        StudentRepository.students.add(student3);
    }
}
