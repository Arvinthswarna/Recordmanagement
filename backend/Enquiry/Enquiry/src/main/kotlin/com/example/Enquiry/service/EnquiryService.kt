package com.example.Enquiry.service

import com.example.Enquiry.model.Enquiry
import com.example.Enquiry.repository.EnquiryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EnquiryService {
    @Autowired
    private val enquiryRepository: EnquiryRepository? = null
    fun saveEnquiry(enquiry: Enquiry): Enquiry {
        return enquiryRepository?.save(enquiry) ?: enquiry

    }

    fun findEnquiryById(enqId: Long?): Enquiry? {
        return enquiryRepository?.findByEnqId(enqId)

    }

    fun deleteEnquiryById(enqId: Long?) {
        if (enqId != null) {
            enquiryRepository?.deleteById(enqId)
        }
    }
    fun getAllEnquiries(): List<Any?>? {
        return enquiryRepository?.findAll()
    }


}