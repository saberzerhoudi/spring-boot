DROP TABLE IF EXISTS student_course;
DROP TABLE IF EXISTS student;
DROP TABLE IF EXISTS course;

CREATE TABLE IF NOT EXISTS course (
    id VARCHAR(255) PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    prerequisites TEXT
);

CREATE TABLE IF NOT EXISTS student (
    id BIGINT PRIMARY KEY,
    mat_nr VARCHAR(255) NOT NULL,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS student_course (
    student_id BIGINT,
    course_id VARCHAR(255),
    PRIMARY KEY (student_id, course_id),
    FOREIGN KEY (student_id) REFERENCES student (id),
    FOREIGN KEY (course_id) REFERENCES course (id)
);