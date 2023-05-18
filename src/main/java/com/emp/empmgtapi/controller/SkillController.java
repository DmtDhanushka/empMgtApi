package com.emp.empmgtapi.controller;

import com.emp.empmgtapi.entity.Employee;
import com.emp.empmgtapi.entity.Skill;
import com.emp.empmgtapi.service.EmployeeService;
import com.emp.empmgtapi.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillController {
    @Autowired
    private SkillService skillService;

    @PostMapping("/save")
    public ResponseEntity<Skill> saveEmployee(@RequestBody Skill skillObj) {
        skillService.saveEmployee(skillObj);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = {"/getSkills", "/{skillId}"})
    public List<Skill> getEmployee(@PathVariable(required = false) Long skillId) {
        return skillService.getSkillDetails(skillId);
    }

    @DeleteMapping("delete/{skillId}")
    public ResponseEntity removeEmployee(@PathVariable Long skillId) {
        skillService.deleteSkill(skillId);
        return new ResponseEntity(HttpStatus.OK);
    }


    @PutMapping("/updateSkill/{skillId}")
    public ResponseEntity<Skill> updateSkill(@PathVariable Long skillId, @RequestBody Skill skillObj){
        skillService.updateSkill(skillId, skillObj);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
