package com.example.Admin.model

import javax.persistence.*

@Entity
@Table(name = "admin")
class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private var adminId: Long? = null

    @Column(name = "email")
    private var email: String? = null

    @Column(name = "password")
    private var password: String? = null

    fun Admin() {}
    fun Admin(email: String?, password: String?) {
        this.email = email
        this.password = password
    }
    fun getAdminId(): Long? {
        return adminId
    }

    fun setAdminId(adminId: Long?) {
        this.adminId = adminId
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
        return "Admin(adminId=$adminId, email=$email, password=$password)"
    }


}