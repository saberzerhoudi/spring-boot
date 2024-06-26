DROP TABLE IF EXISTS course_prerequisites;
DROP TABLE IF EXISTS student_course;
DROP TABLE IF EXISTS person;  -- Adjusted from 'student'
DROP TABLE IF EXISTS course;
DROP TABLE IF EXISTS faculty;

CREATE TABLE IF NOT EXISTS course (
    id VARCHAR(255) PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT
);

CREATE TABLE IF NOT EXISTS person (  -- Unified person table
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    mat_nr VARCHAR(255),  -- Specific to students
    faculty VARCHAR(255),  -- Specific to teachers
    type VARCHAR(10) NOT NULL  -- Discriminator column
);

CREATE TABLE IF NOT EXISTS student_course (
    student_id BIGINT,
    course_id VARCHAR(255),
    PRIMARY KEY (student_id, course_id),
    FOREIGN KEY (student_id) REFERENCES person (id) ON DELETE CASCADE,
    FOREIGN KEY (course_id) REFERENCES course (id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS course_prerequisites (
    course_id VARCHAR(255),
    prerequisite_id VARCHAR(255),
    PRIMARY KEY (course_id, prerequisite_id),
    FOREIGN KEY (course_id) REFERENCES course (id) ON DELETE CASCADE,
    FOREIGN KEY (prerequisite_id) REFERENCES course (id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS faculty (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL UNIQUE,
    description TEXT
);

