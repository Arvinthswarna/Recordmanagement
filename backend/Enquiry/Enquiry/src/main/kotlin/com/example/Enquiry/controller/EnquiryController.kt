package com.example.Enquiry.controller

import com.example.Enquiry.model.Enquiry
import com.example.Enquiry.service.EnquiryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/enquiry")
@CrossOrigin(origins = ["*"])
class EnquiryController {
    @Autowired
    private val enquiryService: EnquiryService? = null

    @PostMapping("/")
    fun saveEnquiry(@RequestBody enquiry: Enquiry?): Enquiry? {
        return enquiry?.let { enquiryService?.saveEnquiry(it) }
    }
    @GetMapping("/{id}")
    fun findEnquiryById(@PathVariable("id") enqId: Long?): Enquiry? {
        return enquiryService?.findEnquiryById(enqId)
    }

//    @PutMapping("/{id}")
//    fun updateSupportById(@PathVariable("id") supportId: Long?, @RequestBody support: Support): Support? {
//        val userData: Optional<Support> = Optional.ofNullable(supportService?.findSupportById(supportId))
//        if (userData.isPresent()) {
//            val _support: Support = userData.get()
//            _support.setEmail(support.getEmail())
//            _support.setPassword(support.getPassword())
//            return supportService?.saveSupport(_support)
//        }
//        return supportService(HttpStatus.NOT_FOUND)
//    }
//
//    private fun supportService(notFound: HttpStatus): Support? {
//        return supportService(HttpStatus.NOT_FOUND)
//    }
//
    @DeleteMapping("/{id}")
    fun deleteEnquiryById(@PathVariable("id") enqId: Long?) {
        enquiryService?.deleteEnquiryById(enqId)
    }

    @get:GetMapping("/")
    val allenquiries: List<Any?>?
        get() {
            val support: List<Enquiry> = ArrayList<Enquiry>()
            return enquiryService?.getAllEnquiries()
        }
    @PutMapping("/{id}")
    fun updateEnquiryById(@PathVariable("id") enqId: Long?, @RequestBody enquiry: Enquiry): Enquiry? {
        val enquiryData: Optional<Enquiry> = Optional.ofNullable(enquiryService?.findEnquiryById(enqId))
        if (enquiryData.isPresent()) {

            val _enquiry: Enquiry = enquiryData.get()
            _enquiry.setName(enquiry.getName())
            _enquiry.setEmail(enquiry.getEmail())
            _enquiry.setMobNo(enquiry.getMobNo())
            _enquiry.setCity(enquiry.getCity())
            _enquiry.setState(enquiry.getState())
            _enquiry.setCountry(enquiry.getCountry())
            return enquiryService?.saveEnquiry(_enquiry)
        }
        return enquiryService(HttpStatus.NOT_FOUND)
    }

    private fun enquiryService(notFound: HttpStatus): Enquiry? {
        return enquiryService(HttpStatus.NOT_FOUND)
    }
}