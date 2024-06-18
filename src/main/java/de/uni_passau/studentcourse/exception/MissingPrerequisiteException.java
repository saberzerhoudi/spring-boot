package de.uni_passau.studentcourse.exception;

public class MissingPrerequisiteException extends RuntimeException {
    public MissingPrerequisiteException(String message) {
        super(message);
    }
}