package de.uni_passau.studentcourse.student;

import de.uni_passau.studentcourse.course.Course;
import de.uni_passau.studentcourse.person.Person;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Student extends Person {
    @Id
    private String matNr;
    @ManyToMany
    private List<Course> completedCourses;
    @ManyToMany
    private List<Course> currentCourses;

    public Student(String matNr, List<Course> completedCourses, List<Course> currentCourses) {
        this.matNr = matNr;
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
                ", matNr='" + matNr + '\'' +
                ", completedCourses=" + completedCourses +
                ", currentCourses=" + currentCourses +
                '}';
    }
}
