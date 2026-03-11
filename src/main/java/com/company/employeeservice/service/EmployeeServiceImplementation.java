package com.company.employeeservice.service;

import com.company.employeeservice.dto.EmployeeCreateDTO;
import com.company.employeeservice.entity.Employee;
import com.company.employeeservice.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImplementation implements  EmployeeService{


    private final EmployeeRepository employeeRepository;

    @Override
    public Employee createNewEmployee(EmployeeCreateDTO newEmployee) {
      Employee employee= new Employee();
      employee.setName(newEmployee.getName());
      employee.setEmail(newEmployee.getEmail());
      employee.setDepartment(newEmployee.getDepartment());
      employee.setDesignation(newEmployee.getDesignation());
      employee.setSalary(newEmployee.getSalary());
      return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }
}
