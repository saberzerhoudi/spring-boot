package de.uni_passau.studentcourse.faculty;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Faculty, String> {
    Faculty findByTitle(String title);
}
