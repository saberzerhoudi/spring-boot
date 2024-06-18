package de.uni_passau.studentcourse.student;

import de.uni_passau.studentcourse.course.Course;

import java.util.ArrayList;
import java.util.List;

//@Entity
public class Student {
    private Long id;
    private String matNr;
    private String firstName;
    private String lastName;
    private List<Course> completedCourses;
    private List<Course> currentCourses;

    public Student(Long id, String matNr, String firstName, String lastName, List<Course> completedCourses, List<Course> currentCourses) {
        this.id = id;
        this.matNr = matNr;
        this.firstName = firstName;
        this.lastName = lastName;
        this.completedCourses = completedCourses;
        this.currentCourses = currentCourses;
    }

    public Student() {
    }

    public String getMatNr() {
        return matNr;
    }

    public void setMatNr(String matNr) {
        this.matNr = matNr;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Course> getCompletedCourses() {
        return completedCourses;
    }

    public void setCompletedCourses(List<Course> completedCourses) {
        this.completedCourses = completedCourses;
    }

    public List<Course> getCurrentCourses() {
        return currentCourses;
    }

    public void setCurrentCourses(List<Course> currentCourses) {
        this.currentCourses = currentCourses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", matNr='" + matNr + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", completedCourses=" + completedCourses +
                ", currentCourses=" + currentCourses +
                '}';
    }
}
