package de.uni_passau.studentcourse.student;

public class StudentDtoMapper {

    public static StudentDto map(Student student) {
        StudentDto studentDto = new StudentDto();
        studentDto.setMatNr(student.getMatNr());
        studentDto.setFirstName(student.getFirstName());
        studentDto.setLastName(student.getLastName());
        return studentDto;
    }
}
