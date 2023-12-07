package org.perscholas.sprintboot.database.dao;

import org.perscholas.sprintboot.database.entity.User;
import org.perscholas.sprintboot.database.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleDAO extends JpaRepository<UserRole, Long> {
    public List<UserRole> findByUserId(Integer userId);
}
