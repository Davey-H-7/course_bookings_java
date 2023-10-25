package com.codeclan.courselab.coursebookings.repositories;


import com.codeclan.courselab.coursebookings.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

List<Course> findByRating(double rating);

List<Course> findByBookingsCustomerId(Long id);
}
