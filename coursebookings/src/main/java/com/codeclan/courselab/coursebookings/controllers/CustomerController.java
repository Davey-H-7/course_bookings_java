package com.codeclan.courselab.coursebookings.controllers;

import com.codeclan.courselab.coursebookings.models.Course;
import com.codeclan.courselab.coursebookings.models.Customer;
import com.codeclan.courselab.coursebookings.repositories.CourseRepository;
import com.codeclan.courselab.coursebookings.repositories.CustomerRepository;
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
public class CustomerController {


    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value="/customers")
    public ResponseEntity<List<Customer>> getAllCustomers(){
        return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value ="/customers/{id}")
    public Optional<Customer> getCustomer(@PathVariable Long id){
        return customerRepository.findById(id);
    }
//as per course controller note
    @GetMapping(value="/customers/courses")
    public List<Customer> findCustomersByGivenCourse(@RequestParam(name = "course_id") Long id){
        return customerRepository.findByBookingsCourseId(id);
    }
}
