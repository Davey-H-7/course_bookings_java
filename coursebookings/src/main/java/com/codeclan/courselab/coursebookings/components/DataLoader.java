package com.codeclan.courselab.coursebookings.components;

import com.codeclan.courselab.coursebookings.repositories.BookingRepository;
import com.codeclan.courselab.coursebookings.repositories.CourseRepository;
import com.codeclan.courselab.coursebookings.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    public DataLoader(){


    }

    public void run(ApplicationArguments args){
        //seeds go here
    }

}
