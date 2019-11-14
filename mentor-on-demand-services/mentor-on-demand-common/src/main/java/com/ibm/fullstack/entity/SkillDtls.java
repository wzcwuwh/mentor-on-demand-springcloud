package com.ibm.fullstack.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SkillDtls {

    private Long skillDtlsId;
    private String name = "";
    private String toc = "";
    private String prerequisites = "";
}
