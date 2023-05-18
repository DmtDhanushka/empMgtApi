package com.emp.empmgtapi.dto;

import java.sql.Date;
import java.util.Set;

public class EmployeeDTO {
    private Long empId;
    private String name;
    private String email;
    private Date dob;

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Set<Long> getOwningSkillIds() {
        return owningSkillIds;
    }

    public void setOwningSkillIds(Set<Long> owningSkillIds) {
        this.owningSkillIds = owningSkillIds;
    }

    private Set<Long> owningSkillIds;


}
