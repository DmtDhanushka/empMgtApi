package com.emp.empmgtapi.service;

import com.emp.empmgtapi.entity.Employee;
import com.emp.empmgtapi.entity.Skill;
import com.emp.empmgtapi.repository.EmployeeRepository;
import com.emp.empmgtapi.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {
    @Autowired
    private SkillRepository skillRepository;

    public void saveEmployee(Skill skillObj) {
        skillRepository.save(skillObj);
    }

    public List<Skill> getSkillDetails(Long skillId) {
        if (null != skillId) {
            return skillRepository.findAllBySkillId(skillId);
        } else {
            return skillRepository.findAll();
        }
    }

    public void deleteSkill(Long skill_id) {
        skillRepository.deleteById(skill_id);
    }
}
