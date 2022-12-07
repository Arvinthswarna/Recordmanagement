package com.example.Support.Operation.service

import com.example.Support.Operation.model.Support
import com.example.Support.Operation.repository.SupportRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SupportService {
    @Autowired
    private val supportRepository: SupportRepository? = null
    fun saveSupport(support: Support): Support {
        return supportRepository?.save(support) ?: support
    }

    fun findSupportById(supportId: Long?): Support? {
        return supportRepository?.findBySupportId(supportId)
    }

    fun getAllSupports(): List<Any?>? {
        return supportRepository?.findAll()
    }

        fun deleteSupportById(supportId: Long?) {
            if (supportId != null) {
                supportRepository?.deleteById(supportId)
            }
    }





        fun findSupportByEmail(email: String?): Support? {
            return supportRepository?.findByEmail(email);

    }


    fun loginSupport(support: Support?): String? {
        val supports: List<Support> = getAllSupports() as List<Support>
        for (e in supports) {
            if (support != null) {
                if (e.getEmail().contentEquals(support.getEmail()) && e.getPassword()
                        .contentEquals(support.getPassword())
                ) {
                    return "Valid User"
                }
            }
        }
        return "Invalid User"
    }

    }


