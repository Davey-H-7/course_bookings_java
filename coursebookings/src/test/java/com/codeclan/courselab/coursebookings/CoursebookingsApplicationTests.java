package com.codeclan.courselab.coursebookings;

import com.codeclan.courselab.coursebookings.models.Booking;
import com.codeclan.courselab.coursebookings.models.Course;
import com.codeclan.courselab.coursebookings.models.Customer;
import com.codeclan.courselab.coursebookings.repositories.BookingRepository;
import com.codeclan.courselab.coursebookings.repositories.CourseRepository;
import com.codeclan.courselab.coursebookings.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CoursebookingsApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CourseRepository courseRepository;


	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateBooking(){
		Customer customer = new Customer("Bill", "Glasgow", 45);
		customerRepository.save(customer);
		Course course = new Course("Tennis", "Gorbals", 2.5);
		courseRepository.save(course);
		Booking booking = new Booking("04-05-06", customer, course);
		bookingRepository.save(booking);
	}

}
