-- Insert courses
INSERT INTO course (id, title, description) VALUES ('c0', 'JSF', 'Learn JSF.');
INSERT INTO course (id, title, description) VALUES ('c1', 'Maven', 'One of the most popular dependency management tools.');
INSERT INTO course (id, title, description) VALUES ('c2', 'Web Servers', 'Learn about web servers.');
INSERT INTO course (id, title, description) VALUES ('c3', 'Spring Boot', 'Use Spring Boot to bootstrap servers.');
INSERT INTO course (id, title, description) VALUES ('c4', 'Spring Data', 'A course about data persistence on the server.');

-- Define prerequisites
INSERT INTO course_prerequisites (course_id, prerequisite_id) VALUES ('c3', 'c1');
INSERT INTO course_prerequisites (course_id, prerequisite_id) VALUES ('c3', 'c2');
INSERT INTO course_prerequisites (course_id, prerequisite_id) VALUES ('c4', 'c3');

-- Insert persons (students and teachers)
INSERT INTO person (id, mat_nr, first_name, last_name, type) VALUES (1, '23328', 'Max', 'Muster', 'Student');
INSERT INTO person (id, mat_nr, first_name, last_name, type) VALUES (2, '34622', 'Hans', 'Muster', 'Student');
INSERT INTO person (id, mat_nr, first_name, last_name, type) VALUES (3, '48645', 'Alice', 'Klint', 'Student');
INSERT INTO person (id, mat_nr, first_name, last_name, type) VALUES (4, '24232', 'Bob', 'Ser', 'Student');
INSERT INTO person (id, first_name, last_name, faculty, type) VALUES (5, 'John', 'Doe', 'Engineering', 'Teacher');
INSERT INTO person (id, first_name, last_name, faculty, type) VALUES (6, 'Jane', 'Smith', 'Mathematics', 'Teacher');

-- Associate students with courses
INSERT INTO student_course (student_id, course_id) VALUES (1, 'c0');
INSERT INTO student_course (student_id, course_id) VALUES (1, 'c1');
INSERT INTO student_course (student_id, course_id) VALUES (2, 'c3');
INSERT INTO student_course (student_id, course_id) VALUES (3, 'c0');
INSERT INTO student_course (student_id, course_id) VALUES (4, 'c4');

-- Insert faculties
INSERT INTO faculty (title, description) VALUES ('Engineering', 'Engineering faculty description');
INSERT INTO faculty (title, description) VALUES ('Mathematics', 'Mathematics faculty description');
