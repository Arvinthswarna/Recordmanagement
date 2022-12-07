package com.example.Audit.Support.model

import javax.persistence.*

@Entity
@Table(name = "audit")
class Audit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private var auditId: Long? = null

    @Column(name = "email")
    private var email: String? = null

    @Column(name = "password")
    private var password: String? = null

    fun Audit() {}
    fun Audit(email: String?, password: String?) {
        this.email = email
        this.password = password
    }
    fun getAuditId(): Long? {
        return auditId
    }

    fun setAuditId(auditId: Long?) {
        this.auditId = auditId
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
        return "Audit(auditId=$auditId, email=$email, password=$password)"
    }

}