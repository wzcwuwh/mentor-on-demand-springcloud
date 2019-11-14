package com.ibm.fullstack.dao;

import com.ibm.fullstack.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnologyDao extends JpaRepository<Skill, Long> {

    Skill AddTechnology(String skillId);
}
