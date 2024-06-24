package de.uni_passau.studentcourse.teacher;

import de.uni_passau.studentcourse.person.Person;
import jakarta.persistence.Entity;


@Entity
public class Teacher extends Person {
    private String faculty;

    public Teacher(String faculty) {
        this.faculty = faculty;
    }

    public Teacher() {
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "faculty='" + faculty + '\'' +
                '}';
    }
}