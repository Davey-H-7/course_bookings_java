package com.codeclan.courselab.coursebookings.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name ="bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="date")
    private String date;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name="customer_id", nullable = false)
    private Customer customer;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name="course_id", nullable = false)
    private Course course;

    public Booking(String date, Customer customer, Course course) {
        this.date = date;
        this.customer = customer;
        this.course = course;
    }

    public Booking() {
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
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
