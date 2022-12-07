package com.example.Support.Operation.repository

import com.example.Support.Operation.model.Support
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
open interface SupportRepository : JpaRepository<Support?, Long?> {
    fun findBySupportId(supportId: Long?): Support?
    fun findByEmail(email: String?): Support?
}