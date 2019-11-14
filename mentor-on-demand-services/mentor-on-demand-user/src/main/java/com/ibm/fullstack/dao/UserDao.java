package com.ibm.fullstack.dao;

import com.ibm.fullstack.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
    User findByUsernameAndPassword(String username, String password);

    User findByUsernameAndResetPwd(String username, Boolean resetPwd);


}
