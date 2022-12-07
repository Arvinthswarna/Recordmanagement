package com.example.Support.Operation.model

import javax.persistence.*

@Entity
@Table(name = "support")
class Support {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private var supportId: Long? = null

    @Column(name = "email")
    private var email: String? = null

    @Column(name = "password")
    private var password: String? = null

    fun Support() {}
    fun Support(email: String?, password: String?) {
        this.email = email
        this.password = password
    }

    fun getSupportId(): Long? {
        return supportId
    }

    fun setSupportId(supportId: Long?) {
        this.supportId = supportId
    }

    fun getEmail(): String? {
        return email
    }

    fun setEmail(email: String?) {
        this.email = email
    }

    fun getPassword(): String? {
        return password
    }

    fun setPassword(password: String?) {
        this.password = password
    }

    override fun toString(): String {
        return "Support{" +
                "supportId=" + supportId +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}'
    }
}