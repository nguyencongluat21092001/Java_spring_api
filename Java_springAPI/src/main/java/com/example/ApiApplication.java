package com.example;

import com.example.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ApiApplication.class, args);
        EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
        CustomerService customerService = context.getBean(CustomerService.class);
    }

}
