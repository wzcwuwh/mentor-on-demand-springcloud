package com.ibm.fullstack.service;

import com.ibm.fullstack.dao.SearchDao;
import com.ibm.fullstack.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface ISearchService {

    List<User> findUserBySkillNameAndStartDate(String skillName, Date startDate);
}
