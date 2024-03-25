package com.yourapp.model;

public class Equipment {
    // Define the Status enum inside the Equipment class
    public enum Status {
        AVAILABLE, CHECKED_OUT, LOST
    }

    private Long id;
    private String name;
    private String type;
    private Status status; // Use the Status enum for the equipment status

    // Constructor, getters, and setters follow

    public Equipment() {
    }

    // Example of a constructor using status
    public Equipment(Long id, String name, String type, Status status) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.status = status;
    }

    // Standard getters and setters for all fields
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
