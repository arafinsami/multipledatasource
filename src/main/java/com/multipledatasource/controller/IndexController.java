package com.multipledatasource.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multipledatasource.primary.Employee;
import com.multipledatasource.primary.EmployeeRepository;
import com.multipledatasource.secondary.Manager;
import com.multipledatasource.secondary.ManagerRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class IndexController {

	private final EmployeeRepository employeeRepository;

	private final ManagerRepository managerRepository;

	@GetMapping("/primary")
	public List<Employee> getPrimaryDatabaseData() {
		List<Employee> list = employeeRepository.findAll();
		return list;
	}

	@GetMapping("/secondary")
	public List<Manager> getSecondaryDatabaseData() {
		List<Manager> list = managerRepository.findAll();
		return list;
	}
}
