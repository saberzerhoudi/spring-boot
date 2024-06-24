package de.uni_passau.studentcourse.faculty;

public class FacultyDto {
    private String id;
    private String title;
    private String description;

    public FacultyDto(String id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public FacultyDto() {
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
        return "FacultyDto{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
