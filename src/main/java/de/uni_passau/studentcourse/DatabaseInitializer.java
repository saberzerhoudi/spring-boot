package de.uni_passau.studentcourse;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        // Custom initialization code if needed
        System.out.println("Custom initialization tasks can be performed here.");
    }
}