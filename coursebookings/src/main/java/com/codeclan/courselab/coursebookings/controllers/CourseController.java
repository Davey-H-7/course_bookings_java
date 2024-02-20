package com.codeclan.courselab.coursebookings.controllers;

import com.codeclan.courselab.coursebookings.models.Booking;
import com.codeclan.courselab.coursebookings.models.Course;
import com.codeclan.courselab.coursebookings.models.Customer;
import com.codeclan.courselab.coursebookings.repositories.BookingRepository;
import com.codeclan.courselab.coursebookings.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value="/courses")
    public ResponseEntity<List<Course>> getAllCourses(){
        return new ResponseEntity<>(courseRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value ="/courses/{id}")
    public Optional<Course> getCourse(@PathVariable Long id){
        return courseRepository.findById(id);
    }

    //could be combined into getAllCourses using an if statement rating != null return findbyrating else return all.
    @GetMapping(value="/courses/ratings")
    public List<Course> findCoursesByGivenRatingQueryString(@RequestParam (name = "rated") double rating){
        return courseRepository.findByRating(rating);
    }

    @GetMapping(value="/courses/customers")
    public List<Course> findCoursesByCustomer(@RequestParam (name = "customer_id") Long id){
        return courseRepository.findByBookingsCustomerId(id);
    }


}
