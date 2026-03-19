package com.portfolio.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("contacts")
public class Contact {
    @Id
    private String id;
    private String name;
    private String email;
    private String message;

    // Getters and Setters
}