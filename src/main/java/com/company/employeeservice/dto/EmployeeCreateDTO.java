package com.company.employeeservice.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class EmployeeCreateDTO {
    @NotBlank(message = "Employee name can't be empty")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @NotBlank(message = "Email can't be empty")
    @Email(message = "Invalid Email format")
    private String email;

    private String department;
    private String designation;
    @NotNull(message = "Salary cannot be null")
    @Positive(message = "Salary Must be Greater than 0")
    private Double salary;
}
