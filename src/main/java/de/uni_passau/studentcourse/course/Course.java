package de.uni_passau.studentcourse.course;

import java.util.List;

public class Course {
    private String id;
    private String title;
    private String description;
    private List<Course> prerequisites;

    public Course() {
    }

    public Course(String id, String title, String description, List<Course> prerequisites) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.prerequisites = prerequisites;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Course> getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(List<Course> prerequisites) {
        this.prerequisites = prerequisites;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", prerequisites=" + prerequisites +
                '}';
    }
}
