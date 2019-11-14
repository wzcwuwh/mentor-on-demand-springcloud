package com.ibm.fullstack.service.impl;

import com.ibm.fullstack.dao.SearchDao;
import com.ibm.fullstack.entity.User;
import com.ibm.fullstack.service.ISearchService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SearchService implements ISearchService {

    @Autowired
    private SearchDao searchDao;

    @Override
    public List<User> findUserBySkillNameAndStartDate(String skillName, Date startDate) {
        List<User> users = searchDao.findUserBySkillNameAndStartDate(skillName, startDate);
        return users;
    }
}
