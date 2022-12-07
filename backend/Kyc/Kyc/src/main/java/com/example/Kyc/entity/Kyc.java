package com.example.Kyc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kyc")
public class Kyc {
    @Id
    @Column(name="pan")
    private String pan;

    @Column(name="name")
    private String name;

    @Column(name="clientId")
    private Long clientId;

    @Column(name="address")
    private String address;

    @Column(name="age")
    private Long age;

    @Column(name="gender")
    private String gender;

    @Column(name="mobNo")
    private String mobNo;

    @Column(name="email")
    private String email;

    @Column(name="city")
    private String city;

    @Column(name="state")
    private String state;

    @Column(name="country")
    private String country;

    @Column(name="nationality")
    private String nationality;

    public Kyc(String pan, String name, Long clientId, String address, Long age, String gender, String mobNo, String email, String city, String state, String country, String nationality) {
        this.pan = pan;
        this.name = name;
        this.clientId = clientId;
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.mobNo = mobNo;
        this.email = email;
        this.city = city;
        this.state = state;
        this.country = country;
        this.nationality = nationality;
    }
    public Kyc(){

    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Kyc{" +
                "pan=" + pan +
                ", name='" + name + '\'' +
                ", clientId=" + clientId +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", mobNo='" + mobNo + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
