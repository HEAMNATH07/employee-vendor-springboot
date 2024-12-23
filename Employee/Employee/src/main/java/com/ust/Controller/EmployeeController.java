package com.ust.Controller;


import com.ust.services.EmployeeServices;
import com.ust.Employeedetails.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    public EmployeeServices service;

    @PostMapping("/addemployee")
    public Employee createemployee(@RequestBody Employee emp ){
        return service.createemployee(emp);
    }




}

