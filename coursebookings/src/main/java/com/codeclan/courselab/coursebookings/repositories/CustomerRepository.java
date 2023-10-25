package com.codeclan.courselab.coursebookings.repositories;

import com.codeclan.courselab.coursebookings.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {


}
