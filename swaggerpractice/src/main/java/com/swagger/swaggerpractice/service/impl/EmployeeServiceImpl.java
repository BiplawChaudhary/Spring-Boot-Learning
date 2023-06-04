package com.swagger.swaggerpractice.service.impl;

import com.swagger.swaggerpractice.dto.request.EmployeeRequestDto;
import com.swagger.swaggerpractice.dto.response.EmployeeResponseDto;
import com.swagger.swaggerpractice.entity.Address;
import com.swagger.swaggerpractice.entity.Employee;
import com.swagger.swaggerpractice.repo.AddressRepo;
import com.swagger.swaggerpractice.repo.EmployeeRepo;
import com.swagger.swaggerpractice.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepo employeeRepo;
    private final AddressRepo addressRepo;

    public EmployeeServiceImpl(EmployeeRepo employeeRepo, AddressRepo addressRepo) {
        this.employeeRepo = employeeRepo;
        this.addressRepo = addressRepo;
    }

    @Override
    public EmployeeResponseDto saveEmployee(EmployeeRequestDto emp) {
        Employee newEmployee = new Employee();

        newEmployee.setName(emp.getName());
        newEmployee.setSalary(emp.getSalary());

        Address foundAddress = addressRepo.findById(emp.getAddress_id()).get();

        newEmployee.setAddress(foundAddress);

        Employee savedEmployee = employeeRepo.save(newEmployee);

        return new EmployeeResponseDto(savedEmployee);

    }
}
