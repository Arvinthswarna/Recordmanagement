package com.example.Business.User.repository

import com.example.Business.User.model.BusinessUser
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BusinessUserRepository : JpaRepository<BusinessUser,Long> {
    fun findByUserId(userId: Long?): BusinessUser?
    fun findByEmail(email: String?): BusinessUser?
}