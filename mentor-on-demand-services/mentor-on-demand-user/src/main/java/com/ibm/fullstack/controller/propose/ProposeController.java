package com.ibm.fullstack.controller.propose;

import com.ibm.fullstack.client.UserClient;
import com.ibm.fullstack.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProposeController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserClient userClient;

//    @PostMapping(value = "/propose/{skillId}/{mentorId}")
//    public void propose(String skillId, String mentorId){
//
//    }
}
