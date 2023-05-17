package com.emp.empmgtapi.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue
    @Column(name = "emp_id")
    private Long empId;
    private String name;
    private String email;
    private Date dob;
}
