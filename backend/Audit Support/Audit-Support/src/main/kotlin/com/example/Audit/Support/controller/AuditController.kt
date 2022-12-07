package com.example.Audit.Support.controller

import com.example.Audit.Support.model.Audit
import com.example.Audit.Support.service.AuditService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/audit")
@CrossOrigin(origins = ["*"])
class AuditController {
    @Autowired
    private val auditService : AuditService? = null

    @PostMapping("/")
    fun saveAudit(@RequestBody audit: Audit?): Audit? {
        return audit?.let { auditService?.saveAudit(it) }
    }

    @GetMapping("/{id}")
    fun findAuditById(@PathVariable("id") auditId: Long?): Audit? {
        return auditService?.findAuditById(auditId)
    }
    @PutMapping("/{id}")
    fun updateAuditById(@PathVariable("id") auditId: Long?, @RequestBody audit: Audit): Audit? {
        val auditData: Optional<Audit> = Optional.ofNullable(auditService?.findAuditById(auditId))
        if (auditData.isPresent()) {
            val _audit: Audit = auditData.get()
            _audit.setEmail(audit.getEmail())
            _audit.setPassword(audit.getPassword())
            return auditService?.saveAudit(_audit)
        }
        return auditService(HttpStatus.NOT_FOUND)
    }

    private fun auditService(notFound: HttpStatus): Audit? {
        return auditService(HttpStatus.NOT_FOUND)
    }
    @DeleteMapping("/{id}")
    fun deleteAuditById(@PathVariable("id") auditId: Long?) {
        auditService?.deleteAuditById(auditId)
    }

    @get:GetMapping("/")
    val allaudit: List<Any?>?
        get() {
            val audit: List<Audit> = ArrayList<Audit>()
            return auditService?.getAllAudits()
        }


//    @PostMapping("/signin")
//    fun validateAudit(@RequestBody audit: Audit): String? {
//        return try {
//            val auditData: Audit = auditService?.findAuditByEmail(audit.getEmail()) ?: audit
//            if (audit.getEmail().equals(auditData.getEmail()) && audit.getPassword()
//                    .equals(auditData.getPassword())
//            ) {
//                "Valid User"
//            } else {
//                "Invalid User"
//            }
//        } catch (ex: Exception) {
//            "Invalid User"
//        }
//    }
    @PostMapping("/signin")
    fun loginAudit(@RequestBody audit: Audit?): String? {
    return auditService?.loginAudit(audit)
}
}