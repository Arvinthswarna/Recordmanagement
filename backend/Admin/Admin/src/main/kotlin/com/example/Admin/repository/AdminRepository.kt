package com.example.Admin.repository

import com.example.Admin.model.Admin
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AdminRepository : JpaRepository<Admin, Long> {
    fun findByAdminId(adminId: Long?): Admin?
    fun findByEmail(email: String?): Admin?
}