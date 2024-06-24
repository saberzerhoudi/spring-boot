-- Insert courses
INSERT INTO course (id, title, description, prerequisites) VALUES ('c0', 'JSF', 'Learn JSF.', NULL);
INSERT INTO course (id, title, description, prerequisites) VALUES ('c1', 'Maven', 'One of the most popular dependency management tools.', NULL);
INSERT INTO course (id, title, description, prerequisites) VALUES ('c2', 'Web Servers', 'Learn about web servers.', NULL);
INSERT INTO course (id, title, description, prerequisites) VALUES ('c3', 'Spring Boot', 'Use Spring Boot to bootstrap servers.', 'c1,c2');
INSERT INTO course (id, title, description, prerequisites) VALUES ('c4', 'Spring Data', 'A course about data persistence on the server.', 'c3');

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