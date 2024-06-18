package de.uni_passau.studentcourse.course;

import java.util.List;
import java.util.stream.Collectors;

public class CourseDtoMapper {
    public static CourseDto map(Course course) {
        CourseDto courseDto = new CourseDto();
        courseDto.setId(course.getId());
        courseDto.setTitle(course.getTitle());
        courseDto.setDescription(course.getDescription());
        if (course.getPrerequisites() != null && !course.getPrerequisites().isEmpty()) {
            List<CourseDto> prerequisites = course.getPrerequisites().stream()
                    .map(CourseDtoMapper::map) // Recursive mapping
                    .collect(Collectors.toList());
            courseDto.setPrerequisites(prerequisites);
        }
        return courseDto;
    }
}
