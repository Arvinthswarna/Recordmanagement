package com.example.Admin.service

import com.example.Admin.model.Admin
import com.example.Admin.repository.AdminRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AdminService {
    @Autowired
    private val adminRepository: AdminRepository? = null

    fun saveAdmin(admin: Admin): Admin {
        return adminRepository?.save(admin) ?: admin
    }

    fun findAdminById(adminId: Long?): Admin? {
        return adminRepository?.findByAdminId(adminId)

    }

    fun deleteAdminById(adminId: Long?) {
        if (adminId != null) {
            adminRepository?.deleteById(adminId)
        }
    }

    fun getAllAdmins(): List<Any?>? {
        return adminRepository?.findAll()
    }

    fun loginSupport(admin: Admin?): String? {
        val admins: List<Admin> = getAllAdmins() as List<Admin>
        for (e in admins) {
            if (admin != null) {
                if (e.getEmail().contentEquals(admin.getEmail()) && e.getPassword()
                        .contentEquals(admin.getPassword())
                ) {
                    return "Valid User"
                }
            }
        }
        return "Invalid User"
    }

//    fun findAdminByEmail(email: String?): Admin? {
//        return adminRepository?.findByEmail(email)
//    }

}