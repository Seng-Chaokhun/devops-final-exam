package com.example.devops.seeders;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseSeeder implements CommandLineRunner {

    @Override
    public void run(String... args) {
        System.out.println("Database Seeder Executed");
    }
}