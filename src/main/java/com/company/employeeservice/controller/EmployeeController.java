package com.company.employeeservice.controller;

import com.company.employeeservice.dto.EmployeeCreateDTO;
import com.company.employeeservice.entity.Employee;
import com.company.employeeservice.service.EmployeeService;
import com.company.employeeservice.service.EmployeeServiceImplementation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Employees")
public class EmployeeController {

    private final EmployeeService employeeService;
    @PostMapping
    public Employee CreateEmployee(@Valid @RequestBody EmployeeCreateDTO employee){
        return employeeService.createNewEmployee(employee);
    }



}
