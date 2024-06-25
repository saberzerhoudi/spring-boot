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

-- Insert students
INSERT INTO student (id, mat_nr, first_name, last_name) VALUES (1, '23328', 'Max', 'Muster');
INSERT INTO student (id, mat_nr, first_name, last_name) VALUES (2, '34622', 'Hans', 'Muster');
INSERT INTO student (id, mat_nr, first_name, last_name) VALUES (3, '48645', 'Alice', 'Klint');
INSERT INTO student (id, mat_nr, first_name, last_name) VALUES (4, '24232', 'Bob', 'Ser');

-- Associate students with courses
INSERT INTO student_course (student_id, course_id) VALUES (1, 'c0');
INSERT INTO student_course (student_id, course_id) VALUES (1, 'c1');
INSERT INTO student_course (student_id, course_id) VALUES (2, 'c3');
INSERT INTO student_course (student_id, course_id) VALUES (3, 'c0');
INSERT INTO student_course (student_id, course_id) VALUES (4, 'c4');
