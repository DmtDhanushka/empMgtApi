package com.emp.empmgtapi.service;

import com.emp.empmgtapi.entity.Employee;
import com.emp.empmgtapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public void saveEmployee(Employee empObj) {
        employeeRepository.save(empObj);
    }

    public List<Employee> getEmployeeDetails(Long emp_id) {
        if (null != emp_id) {
            return employeeRepository.findAllByEmpId(emp_id);
        } else {
            return employeeRepository.findAll();
        }
    }

    public void deleteEmployee(Long emp_id) {
        employeeRepository.deleteById(emp_id);
    }

    public void updateSkill(Long empId, Employee empObj) {
        Employee currentEmp = employeeRepository.findById(empId).get();
        currentEmp.setName(empObj.getName());
        currentEmp.setDob(empObj.getDob());
        currentEmp.setEmail(empObj.getEmail());
        currentEmp.setOwningSkills(empObj.getOwningSkills());
        employeeRepository.save(currentEmp);
    }
}
