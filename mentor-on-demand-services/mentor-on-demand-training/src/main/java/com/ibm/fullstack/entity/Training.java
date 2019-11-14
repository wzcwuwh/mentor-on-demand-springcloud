package com.ibm.fullstack.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "training")
public class Training implements Serializable {
    private static final long serialVersionUID = 445473077941065980L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "training_id", nullable = false)
    private Long trainingId;

    @Basic
    @Column(name = "status", nullable = false)
    private String status;

    @Basic
    @Column(name = "progress", nullable = false)
    private Integer progress;

    @Basic
    @Column(name = "fees", nullable = false)
    private Float fees;

    @Basic
    @Column(name = "commission_amount", nullable = false)
    private Float commissionAmount;

    @Basic
    @Column(name = "rating", nullable = false)
    private Integer rating;

    @Basic
    @Column(name = "start_date", nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;

    @Basic
    @Column(name = "end_date", nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endDate;

    @Basic
    @Column(name = "amount_received", nullable = false)
    private Float amountReceived;

    @Basic
    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Basic
    @Column(name = "mentor_id", nullable = false)
    private Long mentorId;

    @Basic
    @Column(name = "skill_id", nullable = false)
    private Long skillId;

    @Basic
    @Column(name = "razorpay_payment_id", nullable = false)
    private String razorpayPaymentId;

    @Basic
    @Column(name = "create_date", nullable = false)
    @CreatedDate
    private Date createDate;

    @Basic
    @Column(name = "update_date", nullable = false)
    @LastModifiedDate
    private Date updateDate;
}
