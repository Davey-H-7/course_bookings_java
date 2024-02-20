package com.codeclan.courselab.coursebookings.controllers;

import com.codeclan.courselab.coursebookings.models.Booking;
import com.codeclan.courselab.coursebookings.models.Course;
import com.codeclan.courselab.coursebookings.repositories.BookingRepository;
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
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value="/bookings")
    public ResponseEntity<List<Booking>> getAllBookings(){
        return new ResponseEntity<>(bookingRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value ="/bookings/{id}")
    public Optional<Booking> getBooking(@PathVariable Long id){
        return bookingRepository.findById(id);
    }
//as per course controller note
    @GetMapping(value="/bookings/dates")
    public List<Booking> findBookingsByDate(@RequestParam(name = "date") String date){
        return bookingRepository.findByDate(date);
    }


}
