package com.example.Enquiry.model

import javax.persistence.*

@Entity
@Table(name = "enquiry")
class Enquiry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private var enqId: Long? = null

    @Column(name = "name")
    private var name: String? = null

    @Column(name = "email")
    private var email: String? = null

    @Column(name = "mobNo")
    private var mobNo: String? = null

    @Column(name = "city")
    private var city: String? = null

    @Column(name = "state")
    private var state: String? = null

    @Column(name = "country")
    private var country: String? = null

    fun Enquiry() {}
    fun Enquiry(name:String? ,email: String?, mobNo: String?, city: String?, state:String?, country: String?) {
        this.name = name
        this.email = email
        this.mobNo = mobNo
        this.city = city
        this.state = state
        this.country = country
    }

    fun getEnqId(): Long? {
        return enqId
    }

    fun setEnqId(enqId: Long?) {
        this.enqId = enqId
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }

    fun getEmail(): String? {
        return email
    }

    fun setEmail(email: String?) {
        this.email = email
    }

    fun getMobNo(): String? {
        return mobNo
    }

    fun setMobNo(mobNo: String?) {
        this.mobNo = mobNo
    }

    fun getCity(): String? {
        return city
    }

    fun setCity(city: String?) {
        this.city = city
    }
    fun getState(): String? {
        return state
    }

    fun setState(state: String?) {
        this.state = state
    }
    fun getCountry(): String? {
        return country
    }

    fun setCountry(country: String?) {
        this.country = country
    }

    override fun toString(): String {
        return "Enquiry(enqId=$enqId, name=$name, email=$email, mobNo=$mobNo, city=$city, state=$state, country=$country)"
    }

}