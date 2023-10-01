package com.example.SpringBootProject.Controller;

import com.example.SpringBootProject.Entity.Employee;
import com.example.SpringBootProject.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/EmployeeController")
public class SimpleRESTApiController {

    private EmployeeService employeeService;

    @Autowired
    public SimpleRESTApiController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/findEmployee")
    public Employee SimpleFunction(){
        return employeeService.findEmployee();
    }
}
