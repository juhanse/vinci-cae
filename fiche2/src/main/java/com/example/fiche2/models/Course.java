package com.example.fiche2.models;

public class Course {
    // Constructeur vide requis par JPA / Jackson
    public Course() {}

    public Course(String title, String description, int credits) {
        this.title = title;
        this.description = description;
        this.credits = credits;
    }

    private String title;
    private String description;
    private int credits;

    // getters / setters générés par l'IDE

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

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
