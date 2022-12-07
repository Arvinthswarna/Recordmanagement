package com.example.Audit.Support.repository

import com.example.Audit.Support.model.Audit
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
open interface AuditRepository : JpaRepository<Audit,Long> {
     fun findByAuditId(auditId: Long?): Audit?
     fun findByEmail(email: String?): Audit?

}