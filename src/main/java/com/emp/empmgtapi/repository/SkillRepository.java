package com.emp.empmgtapi.repository;

import com.emp.empmgtapi.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {
    List<Skill> findAllBySkillId(Long skillId);

}
