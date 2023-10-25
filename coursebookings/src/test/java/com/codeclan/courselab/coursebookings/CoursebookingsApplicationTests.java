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

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
		Course course = new Course("Tennis", "Gorbals", 2.5);
		Booking booking = new Booking("04-05-06", customer, course);
		customer.makeBooking(booking);
		course.makeBooking(booking);
		customerRepository.save(customer);
		courseRepository.save(course);
		bookingRepository.save(booking);
	}

	@Test
	public void canGetAllCoursesFromAGivenRating(){
		List<Course> foundCourses = courseRepository.findByRating(4.3);
		assertEquals(1, foundCourses.size());
	}

	@Test
	public void canGetAllCustomersForAGivenCourse(){
		List<Customer> foundCustomers = customerRepository.findByBookingsCourseId(2L);
		assertEquals(1,foundCustomers.size());
		assertEquals("Bella", foundCustomers.get(0).getName());
	}

	@Test
	public void canGetAllCustomersForAGivenCourse2(){
		List<Customer> foundCustomers = customerRepository.findByBookingsCourseId(7L);
		assertEquals(1,foundCustomers.size());
		assertEquals("Georgia", foundCustomers.get(0).getName());
	}

	@Test
	public void canGetAllCoursesForAGivenCustomer(){
		List<Course> foundCourses = courseRepository.findByBookingsCustomerId(5L);
		assertEquals(1,foundCourses.size());
		assertEquals("Soccer Training", foundCourses.get(0).getName());
	}

	@Test
	public void canGetBookingsForGivenDate(){
		List<Booking> foundBookings = bookingRepository.findByDate("25-10-23");
		assertEquals(1,foundBookings.size());
		assertEquals("25-10-23", foundBookings.get(0).getDate());
	}

}
