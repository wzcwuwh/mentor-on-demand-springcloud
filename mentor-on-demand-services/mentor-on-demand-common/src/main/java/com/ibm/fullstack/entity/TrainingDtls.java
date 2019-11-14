package com.ibm.fullstack.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrainingDtls implements Serializable{

    private static final long serialVersionUID = -634205759096693140L;
    private Long trainingDtlsId;
    private String status;
    private Integer progress;
    private Float commissionAmount;
    private Integer rating;
    private Float avgRating = 0.0f;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date startDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date endDate;
    @JsonFormat(pattern = "HH:mm:ss")
    private Date startTime;
    @JsonFormat(pattern = "HH:mm:ss")
    private Date endTime;

    private Float amountReceived;
    private Long userId;
    private String username;
    private Long mentorId;
    private String mentorName;
    private Long skillId;
    private String skillName;
    private Float fees;
}
