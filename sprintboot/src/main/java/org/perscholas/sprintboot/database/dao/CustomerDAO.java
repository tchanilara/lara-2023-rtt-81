package org.perscholas.sprintboot.database.dao;

import org.perscholas.sprintboot.database.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerDAO extends JpaRepository<Customer, Long> {
    public  Customer findById(Integer id);
    @Query("select c from Customer c WHERE c.firstName LIKE %:firstName% and c.lastName LIKE %:lastName%")
    public List<Customer> findByFirstNameAndLastName(String firstName, String lastName);
}
