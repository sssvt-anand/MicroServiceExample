package com.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.departmentservice.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
