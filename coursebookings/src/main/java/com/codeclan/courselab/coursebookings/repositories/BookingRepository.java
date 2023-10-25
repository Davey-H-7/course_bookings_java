package com.codeclan.courselab.coursebookings.repositories;

import com.codeclan.courselab.coursebookings.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

    


}
