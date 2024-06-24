package de.uni_passau.studentcourse.faculty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, String> {
    Optional<Faculty> findByTitle(String title);
}