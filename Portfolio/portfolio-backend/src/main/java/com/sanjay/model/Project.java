package com.portfolio.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("projects")
public class Project {
    @Id
    private String id;
    private String title;
    private String description;
    private String link;

    // Getters and Setters
}