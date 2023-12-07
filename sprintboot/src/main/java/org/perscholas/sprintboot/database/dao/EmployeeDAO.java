package org.perscholas.sprintboot.database.dao;

import org.perscholas.sprintboot.database.entity.Customer;
import org.perscholas.sprintboot.database.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDAO extends JpaRepository<Employee, Long> {

    Employee getById(int id);
}
