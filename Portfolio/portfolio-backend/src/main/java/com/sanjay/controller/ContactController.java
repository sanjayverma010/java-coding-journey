package com.portfolio.controller;

import com.portfolio.model.Contact;
import com.portfolio.model.Project;
import com.portfolio.repository.ContactRepository;
import com.portfolio.repository.ProjectRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ContactController {
    private final ContactRepository contactRepo;
    private final ProjectRepository projectRepo;

    public ContactController(ContactRepository contactRepo, ProjectRepository projectRepo) {
        this.contactRepo = contactRepo;
        this.projectRepo = projectRepo;
    }

    @PostMapping("/contact")
    public Contact saveContact(@RequestBody Contact contact) {
        return contactRepo.save(contact);
    }

    @GetMapping("/projects")
    public List<Project> getProjects() {
        return projectRepo.findAll();
    }
}