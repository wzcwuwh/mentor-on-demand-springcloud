package com.ibm.fullstack.controller;

import com.ibm.fullstack.entity.Skill;
import com.ibm.fullstack.service.impl.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TechnologyController {

    @Autowired
    private TechnologyService technologyService;

    @PostMapping(value = "/{skillId}")
    public Skill addSkill(String skillId){
        return technologyService.AddTechnology(skillId);
    }
}
