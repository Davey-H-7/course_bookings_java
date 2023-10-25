package com.codeclan.courselab.coursebookings.repositories;


import com.codeclan.courselab.coursebookings.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {


}
