package com.example.Intro.controllers;



import com.example.Intro.models.Employee;
import com.example.Intro.models.Status;
import com.example.Intro.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController{

    @Autowired
    EmployeeRepository employeeRepository;


    //1 Create a route to get all doctors.
    @GetMapping("/doctors")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    //2 Create a route to get a doctor by employee_id.
    @GetMapping("/doctors-id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Employee findEmployeeById(@PathVariable Integer id) {
        return employeeRepository.findById(id).get();
    }


    //3 Create a route to get doctors by status.
    @GetMapping("/doctors-status/{status}")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> findAllEmployeesByStatus(@PathVariable Status status) {
        return employeeRepository.findByStatus(status);
    }


    //4 Create a route to get doctors by department.
    @GetMapping("/doctors-department/{department}")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> findAllEmployeesByDepartment(@PathVariable String department) {
        return employeeRepository.findByDepartment(department);
    }




}
