package org.perscholas.sprintboot.database.dao;

import org.perscholas.sprintboot.database.entity.Customer;
import org.perscholas.sprintboot.database.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Long> {
    User findById(Integer id);
    User findByEmailIgnoreCase(String email);
}
