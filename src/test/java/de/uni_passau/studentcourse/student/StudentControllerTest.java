package de.uni_passau.studentcourse.student;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.uni_passau.studentcourse.course.Course;
import de.uni_passau.studentcourse.course.CourseDto;
import de.uni_passau.studentcourse.course.CourseDtoMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(StudentController.class)
class StudentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private StudentService studentService;

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void getStudentTest() throws Exception {
        StudentDto mockStudentDto = new StudentDto();
        mockStudentDto.setMatNr("48645");
        mockStudentDto.setFirstName("Alice");
        mockStudentDto.setLastName("Klint");

        given(studentService.getStudent("48645")).willReturn(Optional.of(new Student(3L, "48645", "Alice", "Klint", null, null)));

        mockMvc.perform(get("/api/v1/students/48645"))
                .andExpect(status().isOk());
    }

    @Test
    void registerStudentForCourseTest() throws Exception {
        mockMvc.perform(post("/api/v1/students/48645/courses/c0")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated());

        verify(studentService, times(1)).registerStudentToCourse("48645", "c0");
    }
}