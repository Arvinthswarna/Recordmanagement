package com.example.Business.User.model

import javax.persistence.*

@Entity
@Table(name = "business")
class BusinessUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private var userId: Long? = null

    @Column(name = "email")
    private var email: String? = null

    @Column(name = "password")
    private var password: String? = null

    fun BusinessUser() {}
    fun BusinessUser(email: String?, password: String?) {
        this.email = email
        this.password = password
    }
    fun getUserId(): Long? {
        return userId
    }

    fun setUserId(userId: Long?) {
        this.userId = userId
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
        return "BusinessUser(userId=$userId, email=$email, password=$password)"
    }

}