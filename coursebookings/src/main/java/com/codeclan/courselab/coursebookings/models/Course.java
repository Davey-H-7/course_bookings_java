package com.codeclan.courselab.coursebookings.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="courses")
public class Course {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;


    @Column(name="name")
    private String name;

    @Column(name="location")
    private String location;

    @Column(name="rating")
    private double rating;

    @JsonBackReference
    @OneToMany(mappedBy = "bookings")
    private List<Booking> bookings;

    public Course(String name, String location, double rating) {
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.bookings = new ArrayList<>();
    }

    public Course() {
    }

    public List<Booking> getBookings() {
        return bookings;
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

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void makeBooking(Booking booking){
        this.bookings.add(booking);
    }
}
