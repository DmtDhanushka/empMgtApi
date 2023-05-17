package com.emp.empmgtapi.controller;

import com.emp.empmgtapi.entity.Employee;
import com.emp.empmgtapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee empObj) {
        employeeService.saveEmployee(empObj);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = {"/getEmployees","/{empId}"})
    public List<Employee> getEmployee(@PathVariable(required = false) Long empId) {
        return employeeService.getEmployeeDetails(empId);
    }

    @DeleteMapping("delete/{empId}")
    public ResponseEntity removeEmployee(@PathVariable Long empId) {
        employeeService.deleteEmployee(empId);
        return new ResponseEntity(HttpStatus.OK);
    }

}
