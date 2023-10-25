package com.codeclan.courselab.coursebookings.models;

public class Booking {

    private Long id;
    private String date;

    public Booking(String date) {
        this.date = date;
    }

    public Booking() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
