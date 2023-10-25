package com.codeclan.courselab.coursebookings.models;

public class Course {

    private Long id;

    private String name;

    private String location;

    private float rating;

    public Course(String name, String location, float rating) {
        this.name = name;
        this.location = location;
        this.rating = rating;
    }

    public Course() {
    }

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
