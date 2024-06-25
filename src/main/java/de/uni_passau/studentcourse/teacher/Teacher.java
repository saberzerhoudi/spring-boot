package de.uni_passau.studentcourse.teacher;

import de.uni_passau.studentcourse.person.Person;
import jakarta.persistence.Entity;
import jakarta.persistence.DiscriminatorValue;

@Entity
@DiscriminatorValue("Teacher")
public class Teacher extends Person {
    private String faculty; // Faculty to which the teacher belongs

    public Teacher(String faculty) {
        this.faculty = faculty;
    }

    public Teacher(Long id, String firstName, String lastName, String faculty) {
        super(id, firstName, lastName);
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
