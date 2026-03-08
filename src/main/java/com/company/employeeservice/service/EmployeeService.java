package com.company.employeeservice.service;

import com.company.employeeservice.dto.EmployeeCreateDTO;
import com.company.employeeservice.entity.Employee;
import org.springframework.stereotype.Service;


public interface EmployeeService{
    public Employee createNewEmployee(EmployeeCreateDTO newEmployee);


}
