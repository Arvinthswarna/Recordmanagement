package com.example.Business.User.service

import com.example.Business.User.model.BusinessUser
import com.example.Business.User.repository.BusinessUserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BusinessUserService {
    @Autowired
    private val businessUserRepository : BusinessUserRepository? = null

    fun saveBusinessUser(businessUser: BusinessUser): BusinessUser {
        return businessUserRepository?.save(businessUser) ?: businessUser
    }

    fun findBusinessUserById(userId: Long?): BusinessUser? {
        return businessUserRepository?.findByUserId(userId)

    }

    fun deleteBusinessUserById(userId: Long?) {
        if (userId != null) {
            businessUserRepository?.deleteById(userId)
        }

    }

    fun getAllBusinessUsers(): List<Any?>? {
        return businessUserRepository?.findAll()
    }

    fun loginBusinessUser(businessUser: BusinessUser?): String? {
        val businessUsers: List<BusinessUser> = getAllBusinessUsers() as List<BusinessUser>
        for (e in businessUsers) {
            if (businessUser != null) {
                if (e.getEmail().contentEquals(businessUser.getEmail()) && e.getPassword()
                        .contentEquals(businessUser.getPassword())
                ) {
                    return "Valid User"
                }
            }
        }
        return "Invalid User"
    }

//    fun findBusinessUserByEmail(email: String?): BusinessUser? {
//        return businessUserRepository?.findByEmail(email)
//
//    }
}