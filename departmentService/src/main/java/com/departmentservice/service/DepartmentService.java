package com.departmentservice.service;

import java.util.List;

import com.departmentservice.entity.Department;

public interface DepartmentService {
    Department saveDepartment(Department department);

    Department getDepartmentById(Long departmentId);
 List<Department> getAllDepartment();
}