package com.ibm.fullstack.dao;

import com.ibm.fullstack.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface SearchDao extends JpaRepository<User, Long> {

    @Query(nativeQuery = true, value = "select * from ibm_mentor_on_demand._user where _role = 'mentor' and user_id = " +
    "(select mentor_id from ibm_mentor_on_demand.training where skill_id = " +
    "(select skill_id from ibm_mentor_on_demand.skill where skill_name = :skillName and start_date = :startDate))")
    List<User> findUserBySkillNameAndStartDate(@Param("skillName") String skillName, @Param("startDate") Date startDate);
}
