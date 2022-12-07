package com.example.Life.Insurance.model;

import javax.persistence.*;

@Entity
@Table(name="lifeInsurance")
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

    public LifeInsurance(String policyType, Long policyNo, String insuredName, String address, String mobNo, String email, String occupation, String education, String designation, String medicalStatus, Long premiumAmount, Long annualIncome) {
        this.policyType = policyType;
        this.policyNo = policyNo;
        this.insuredName = insuredName;
        this.address = address;
        this.mobNo = mobNo;
        this.email = email;
        this.occupation = occupation;
        this.education = education;
        this.designation = designation;
        this.medicalStatus = medicalStatus;
        this.premiumAmount = premiumAmount;
        this.annualIncome = annualIncome;
    }
    public LifeInsurance(){

    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public Long getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(Long policyNo) {
        this.policyNo = policyNo;
    }

    public String getInsuredName() {
        return insuredName;
    }

    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getMedicalStatus() {
        return medicalStatus;
    }

    public void setMedicalStatus(String medicalStatus) {
        this.medicalStatus = medicalStatus;
    }

    public Long getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(Long premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public Long getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Long annualIncome) {
        this.annualIncome = annualIncome;
    }

    @Override
    public String toString() {
        return "LifeInsurance{" +
                "clientId=" + clientId +
                ", policyType='" + policyType + '\'' +
                ", policyNo=" + policyNo +
                ", insuredName='" + insuredName + '\'' +
                ", address='" + address + '\'' +
                ", mobNo='" + mobNo + '\'' +
                ", email='" + email + '\'' +
                ", occupation='" + occupation + '\'' +
                ", education='" + education + '\'' +
                ", designation='" + designation + '\'' +
                ", medicalStatus='" + medicalStatus + '\'' +
                ", premiumAmount=" + premiumAmount +
                ", annualIncome=" + annualIncome +
                '}';
    }
}
