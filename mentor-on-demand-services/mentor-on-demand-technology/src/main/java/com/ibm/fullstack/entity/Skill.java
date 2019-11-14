package com.ibm.fullstack.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "skill")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id", nullable = false)
    private Long skillId;

    @Basic
    @Column(name = "skill_name", nullable = false)
    private String skillName;

    @Basic
    @Column(name = "toc", nullable = false)
    private String toc;

    @Basic
    @Column(name = "prerequisites", nullable = false)
    private String prerequisites;

    @Basic
    @Column(name = "start_date", nullable = false)
    @CreatedDate
    private Date createDate;

    @Basic
    @Column(name = "update_date", nullable = false)
    @LastModifiedDate
    private Date updateDate;
}
