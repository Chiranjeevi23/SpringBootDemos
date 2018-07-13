package com.openspace.angularjscrud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.openspace.angularjscrud.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	Employee findByName(String name);
}
