package de.uni_passau.studentcourse.faculty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Faculty {
    @Id
    private String id;
    private String title;
    private String description;

    public Faculty(String id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Faculty() {
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

    @Override
    public String toString() {
        return "Faculty{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
