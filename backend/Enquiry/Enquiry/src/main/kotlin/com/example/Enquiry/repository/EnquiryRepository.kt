package com.example.Enquiry.repository

import com.example.Enquiry.model.Enquiry
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
open interface EnquiryRepository : JpaRepository<Enquiry?, Long> {
    fun findByEnqId(enqId: Long?): Enquiry?

}