package com.ibm.fullstack.service.impl;

import com.ibm.fullstack.dao.TechnologyDao;
import com.ibm.fullstack.entity.Skill;
import com.ibm.fullstack.service.ITechnologyService;
import org.springframework.beans.factory.annotation.Autowired;

public class TechnologyService implements ITechnologyService {

    @Autowired
    private TechnologyDao technologyDao;

    public Skill AddTechnology(String skillId){
        return technologyDao.AddTechnology(skillId);
    }
}
