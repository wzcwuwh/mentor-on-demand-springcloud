package com.ibm.fullstack.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDtls implements Serializable {

    private static final long serialVersionUID = -3358172059857477532L;
    private Long paymentDtlsId;
    private String txnType;
    private Float amount;
    private String remarks;
    private Long mentorId;
    private String mentorName;
    private Long trainingId;
    private String skillName;
    private Float totalAmountToMentor;
}
