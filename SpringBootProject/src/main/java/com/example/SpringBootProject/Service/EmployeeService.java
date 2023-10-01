package com.example.SpringBootProject.Service;

import com.example.SpringBootProject.Entity.Employee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    public EmployeeService() {
    }

    public Employee findEmployee(){
        return new Employee(1L,"Vijay",25,"Developer");
    }
}
