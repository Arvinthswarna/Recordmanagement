package com.example.Admin.controller

import com.example.Admin.model.Admin
import com.example.Admin.service.AdminService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = ["*"])
class AdminController {
    @Autowired
    private val adminService : AdminService? = null

    @PostMapping("/")
    fun saveAdmin(@RequestBody admin: Admin?): Admin? {
        return admin?.let { adminService?.saveAdmin(it) }
    }

    @GetMapping("/{id}")
    fun findAdminById(@PathVariable("id") adminId: Long?): Admin? {
        return adminService?.findAdminById(adminId)
    }
    @PutMapping("/{id}")
    fun updateAdminById(@PathVariable("id") adminId: Long?, @RequestBody admin: Admin): Admin? {
        val auditData: Optional<Admin> = Optional.ofNullable(adminService?.findAdminById(adminId))
        if (auditData.isPresent()) {
            val _admin: Admin = auditData.get()
            _admin.setEmail(admin.getEmail())
            _admin.setPassword(admin.getPassword())
            return adminService?.saveAdmin(_admin)
        }
        return adminService(HttpStatus.NOT_FOUND)
    }

    private fun adminService(notFound: HttpStatus): Admin? {
        return adminService(HttpStatus.NOT_FOUND)
    }
    @DeleteMapping("/{id}")
    fun deleteAdminById(@PathVariable("id") adminId: Long?) {
        adminService?.deleteAdminById(adminId)
    }

    @get:GetMapping("/")
    val alladmin: List<Any?>?
        get() {
            val audit: List<Admin> = ArrayList<Admin>()
            return adminService?.getAllAdmins()
        }


//    @PostMapping("/signin")
//    fun validateAdmin(@RequestBody admin: Admin): String? {
//        return try {
//            val auditData: Admin = adminService?.findAdminByEmail(admin.getEmail()) ?: admin
//            if (admin.getEmail().equals(auditData.getEmail()) && admin.getPassword()
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
    fun loginSupport(@RequestBody admin: Admin?): String? {
        return adminService?.loginSupport(admin)
}
}