package com.example.Audit.Support.service

import com.example.Audit.Support.model.Audit
import com.example.Audit.Support.repository.AuditRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AuditService {
    @Autowired
    private val auditRepository : AuditRepository? = null
    fun saveAudit(audit: Audit): Audit {
        return auditRepository?.save(audit) ?: audit
    }

    fun findAuditById(auditId: Long?): Audit? {
        return auditRepository?.findByAuditId(auditId)

    }

    fun deleteAuditById(auditId: Long?) {
        if (auditId != null) {
            auditRepository?.deleteById(auditId)
        }

    }

    fun getAllAudits(): List<Any?>? {
        return auditRepository?.findAll()

    }

    fun findAuditByEmail(email: String?): Audit? {
        return auditRepository?.findByEmail(email)
    }

    fun loginAudit(audit: Audit?): String? {
        val audits: List<Audit> = getAllAudits() as List<Audit>
        for (e in audits) {
            if (audit != null) {
                if (e.getEmail().contentEquals(audit.getEmail()) && e.getPassword()
                        .contentEquals(audit.getPassword())
                ) {
                    return "Valid User"
                }
            }
        }
        return "Invalid User"
    }
}