package com.sherwin.getarrays.employeemanager.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sherwin.getarrays.employeemanager.model.Employee;

public interface EmployeeRepo extends  JpaRepository<Employee, Long>{

	Optional<Employee> findEmployeeById(Long id);

	void deleteEmployeeById(Long id);
	
	
}
