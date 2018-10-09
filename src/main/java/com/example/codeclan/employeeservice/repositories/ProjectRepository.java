package com.example.codeclan.employeeservice.repositories;

import com.example.codeclan.employeeservice.models.Department;
import com.example.codeclan.employeeservice.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
