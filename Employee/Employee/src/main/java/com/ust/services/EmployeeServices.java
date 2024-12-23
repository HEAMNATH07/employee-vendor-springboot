package com.ust.services;


import com.ust.Employeedetails.Employee;
import com.ust.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServices{

    @Autowired
    private EmployeeRepository repo;
    public Employee createemployee(Employee emp) {
        return repo.save(emp);
    }


}

