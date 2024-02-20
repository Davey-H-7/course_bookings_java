package com.codeclan.courselab.coursebookings.components;

import com.codeclan.courselab.coursebookings.models.Booking;
import com.codeclan.courselab.coursebookings.models.Course;
import com.codeclan.courselab.coursebookings.models.Customer;
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
        Customer customer1 = new Customer("Aiden", "Edinburgh", 28);
        Customer customer2 = new Customer("Bella", "Glasgow", 24);
        Customer customer3 = new Customer("Cameron", "Aberdeen", 31);
        Customer customer4 = new Customer("Dylan", "Dundee", 26);
        Customer customer5 = new Customer("Ella", "Inverness", 29);
        Customer customer6 = new Customer("Finlay", "Stirling", 35);
        Customer customer7 = new Customer("Georgia", "Perth", 23);
        Customer customer8 = new Customer("Hamish", "Dunfermline", 27);
        Customer customer9 = new Customer("Isla", "Kirkcaldy", 30);
        Customer customer10 = new Customer("Jack", "Falkirk", 32);

        Course sportsCourse1 = new Course("Tennis Lessons", "Edinburgh Sports Club", 4.5);
        Course sportsCourse2 = new Course("Golf Instruction", "Glasgow Golf Academy", 4.2);
        Course sportsCourse3 = new Course("Swimming Classes", "Aberdeen Aquatic Center", 4.8);
        Course sportsCourse4 = new Course("Basketball Camp", "Dundee Sports Arena", 4.0);
        Course sportsCourse5 = new Course("Soccer Training", "Inverness Soccer Field", 4.6);
        Course sportsCourse6 = new Course("Yoga Classes", "Stirling Yoga Studio", 4.7);
        Course sportsCourse7 = new Course("Martial Arts Workshop", "Perth Dojo", 4.4);
        Course sportsCourse8 = new Course("Cycling Club", "Dunfermline Cycling Track", 4.1);
        Course sportsCourse9 = new Course("Fitness Bootcamp", "Kirkcaldy Fitness Center", 4.3);
        Course sportsCourse10 = new Course("Tae Kwon Do Classes", "Falkirk Martial Arts Center", 4.9);

        Booking booking1 = new Booking("25-10-23", customer1, sportsCourse1);
        Booking booking2 = new Booking("15-11-23", customer2, sportsCourse2);
        Booking booking3 = new Booking("02-12-23", customer3, sportsCourse3);
        Booking booking4 = new Booking("19-01-24", customer4, sportsCourse4);
        Booking booking5 = new Booking("07-02-24", customer5, sportsCourse5);
        Booking booking6 = new Booking("14-03-24", customer6, sportsCourse6);
        Booking booking7 = new Booking("28-04-24", customer7, sportsCourse7);
        Booking booking8 = new Booking("09-05-24", customer8, sportsCourse8);
        Booking booking9 = new Booking("22-06-24", customer9, sportsCourse9);
        Booking booking10 = new Booking("30-07-24", customer10, sportsCourse10);

        customerRepository.save(customer1);
        customerRepository.save(customer2);
        customerRepository.save(customer3);
        customerRepository.save(customer4);
        customerRepository.save(customer5);
        customerRepository.save(customer6);
        customerRepository.save(customer7);
        customerRepository.save(customer8);
        customerRepository.save(customer9);
        customerRepository.save(customer10);

        courseRepository.save(sportsCourse1);
        courseRepository.save(sportsCourse2);
        courseRepository.save(sportsCourse3);
        courseRepository.save(sportsCourse4);
        courseRepository.save(sportsCourse5);
        courseRepository.save(sportsCourse6);
        courseRepository.save(sportsCourse7);
        courseRepository.save(sportsCourse8);
        courseRepository.save(sportsCourse9);
        courseRepository.save(sportsCourse10);

        bookingRepository.save(booking1);
        bookingRepository.save(booking2);
        bookingRepository.save(booking3);
        bookingRepository.save(booking4);
        bookingRepository.save(booking5);
        bookingRepository.save(booking6);
        bookingRepository.save(booking7);
        bookingRepository.save(booking8);
        bookingRepository.save(booking9);
        bookingRepository.save(booking10);

    }

}
