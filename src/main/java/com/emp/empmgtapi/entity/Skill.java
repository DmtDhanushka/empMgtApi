package com.emp.empmgtapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "skills")
public class Skill {
    @Id
    @GeneratedValue
    @Column(name = "skill_id")
    private Long skillId;
    private String label;

    @JsonIgnore
    @ManyToMany(mappedBy = "owningSkills")
    private List<Employee> employeeSet;
}
