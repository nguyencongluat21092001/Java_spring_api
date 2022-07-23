package com.example.controller;

import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(value = "/employees")
    public ResponseEntity<Object> findAllEmployees() {
        return new ResponseEntity<>(employeeRepository.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/employees", method = RequestMethod.POST)
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        employeeRepository.save(employee);
        return new ResponseEntity<Employee>(employee, HttpStatus.CREATED);
    }

}
