package com.company.employeeservice.service;

import com.company.employeeservice.dto.EmployeeCreateDTO;
import com.company.employeeservice.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService{
    public Employee createNewEmployee(EmployeeCreateDTO newEmployee);
    public List<Employee> getEmployees();
    public Employee updateemployee(Long id);

}
