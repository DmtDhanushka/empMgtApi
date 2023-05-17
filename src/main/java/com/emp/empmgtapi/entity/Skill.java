package com.emp.empmgtapi.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "skills")
public class Skill {
    @Id
    @GeneratedValue
    @Column(name = "skill_id")
    private Long skillId;
    private String label;
}
