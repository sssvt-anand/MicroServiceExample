package com.departmentservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.departmentservice.entity.Department;
import com.departmentservice.service.DepartmentService;

@Controller
@RequestMapping("/api/departments")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;

	@PostMapping
	public ResponseEntity<Department> saveDepartment(@RequestBody Department department) {
		Department departmets = departmentService.saveDepartment(department);
		return ResponseEntity.ok(departmets);
	}

	@GetMapping("{id}")
	public ResponseEntity<Department> getDepartmentByID(@PathVariable("id") Long departmentId) {
		Department department = departmentService.getDepartmentById(departmentId);
		return ResponseEntity.ok(department);
	}
	@GetMapping
	public ResponseEntity<List<Department>>get(){
		List<Department>dep=departmentService.getAllDepartment();
		return ResponseEntity.ok(dep);
	}
}
