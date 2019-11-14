package com.ibm.fullstack.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ibm.fullstack.entity.User;
import com.ibm.fullstack.service.ISearchService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@Slf4j
@RestController
public class SearchController {

    @Autowired
    private ISearchService searchService;

    public SearchController(ISearchService searchService) {
        this.searchService = searchService;
    }

    @CrossOrigin(value = "http://localhost:4200")
    @GetMapping(value = "/mentor")
    public JSONObject searchMentor(@RequestBody JSONObject searchJson){
        String technology = searchJson.getString("technology");
        Date startTime = searchJson.getDate("startDate");
        log.info("technology: {}, startTime: {}", technology, startTime);
        List<User> mentors = searchService.findUserBySkillNameAndStartDate(technology, startTime);
        JSONArray mentorArray = new JSONArray(mentors.size());
        for(User user: mentors){
            JSONObject mentorJson = new JSONObject();
            mentorJson.put("mentorName", user.getUsername());
            mentorJson.put("yearsOfExperience", user.getYearsOfExperience());
            mentorArray.add(mentorJson);
        }
        JSONObject retJson = new JSONObject();
        retJson.put("mentors", mentorArray);
        return retJson;
    }
}
