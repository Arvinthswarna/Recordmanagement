package com.example.Kyc.VO;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class LifeInsurance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long clientId;

    @Column(name="policyType")
    private String policyType;

    @Column(name="policyNo")
    private Long policyNo;

    @Column(name="insuredName")
    private String insuredName;

    @Column(name="address")
    private String address;

    @Column(name="mobNo")
    private String mobNo;

    @Column(name="email")
    private String email;

    @Column(name="occupation")
    private String occupation;

    @Column(name="education")
    private String education;

    @Column(name="designation")
    private String designation;

    @Column(name="medicalStatus")
    private String medicalStatus;

    @Column(name="premiumAmount")
    private Long premiumAmount;

    @Column(name="annualIncome")
    private Long annualIncome;
}
