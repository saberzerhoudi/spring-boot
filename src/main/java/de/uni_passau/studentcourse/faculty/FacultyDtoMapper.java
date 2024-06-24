package de.uni_passau.studentcourse.faculty;

public class FacultyDtoMapper {
    public static FacultyDto map(Faculty faculty) {
        FacultyDto facultyDto = new FacultyDto();
        facultyDto.setId(faculty.getId());
        facultyDto.setTitle(faculty.getTitle());
        facultyDto.setDescription(faculty.getDescription());

        return facultyDto;
    }
}
