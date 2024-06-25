package de.uni_passau.studentcourse.student;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository
public class StudentRepository {

    public static List<Student> students = new ArrayList<>();

    public Optional<Student> getStudent(String matNr) {
        return students.stream()
                .filter(student -> Objects.equals(student.getMatNr(), matNr))
                .findFirst();
    }

}
