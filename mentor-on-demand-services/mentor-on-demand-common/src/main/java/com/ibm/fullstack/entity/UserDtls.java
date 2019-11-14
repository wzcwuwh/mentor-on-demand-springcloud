package com.ibm.fullstack.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDtls implements Serializable {

    private static final long serialVersionUID = -4661724301963738358L;
    private Long userDtlsId;
    private String username = "";
    private String password = "";
    private Long contactNo;
    private String regCode;
    private String role;
    private String linkedinUrl;
    private Float yearsOfExperience;
    private Boolean active = false;
    private Boolean confirmedSignup = false;
    private Date resetPwdDate;
    private Boolean resetPwd = false;
}
