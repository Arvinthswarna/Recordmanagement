package com.example.Business.User.controller

import com.example.Business.User.model.BusinessUser
import com.example.Business.User.service.BusinessUserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/businessUser")
@CrossOrigin(origins = ["*"])
class BusinessUserController {
    @Autowired
    private val businessUserService : BusinessUserService? = null

    @PostMapping("/")
    fun saveBusinessUser(@RequestBody businessUser: BusinessUser?): BusinessUser? {
        return businessUser?.let { businessUserService?.saveBusinessUser(it) }
    }

    @GetMapping("/{id}")
    fun findBusinessUserById(@PathVariable("id") userId: Long?): BusinessUser? {
        return businessUserService?.findBusinessUserById(userId)
    }
    @PutMapping("/{id}")
    fun updateBusinessUserById(@PathVariable("id") userId: Long?, @RequestBody businessUser: BusinessUser): BusinessUser? {
        val businessUserData: Optional<BusinessUser> = Optional.ofNullable(businessUserService?.findBusinessUserById(userId))
        if (businessUserData.isPresent()) {
            val _businessUser: BusinessUser = businessUserData.get()
            _businessUser.setEmail(businessUser.getEmail())
            _businessUser.setPassword(businessUser.getPassword())
            return businessUserService?.saveBusinessUser(_businessUser)
        }
        return businessUserService(HttpStatus.NOT_FOUND)
    }

    private fun businessUserService(notFound: HttpStatus): BusinessUser? {
        return businessUserService(HttpStatus.NOT_FOUND)
    }
    @DeleteMapping("/{id}")
    fun deleteBusinessUserById(@PathVariable("id") userId: Long?) {
        businessUserService?.deleteBusinessUserById(userId)
    }

    @get:GetMapping("/")
    val allbusinessUsers: List<Any?>?
        get() {
            val audit: List<BusinessUser> = ArrayList<BusinessUser>()
            return businessUserService?.getAllBusinessUsers()
        }


//    @PostMapping("/signin")
//    fun validateAudit(@RequestBody businessUser: BusinessUser): String? {
//        return try {
//            val businessUserData: BusinessUser = businessUserService?.findBusinessUserByEmail(businessUser.getEmail()) ?: businessUser
//            if (businessUser.getEmail().equals(businessUserData.getEmail()) && businessUser.getPassword()
//                    .equals(businessUserData.getPassword())
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
    fun loginBusinessUser(@RequestBody businessUser: BusinessUser?): String? {
        return businessUserService?.loginBusinessUser(businessUser)
    }
}