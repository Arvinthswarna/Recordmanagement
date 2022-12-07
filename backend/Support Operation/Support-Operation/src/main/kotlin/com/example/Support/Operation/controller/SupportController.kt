package com.example.Support.Operation.controller

import com.example.Support.Operation.model.Support
import com.example.Support.Operation.service.SupportService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.*


@RestController
@RequestMapping("/support")
@CrossOrigin(origins = ["*"])
class SupportController {
    @Autowired
    private val supportService: SupportService? = null

    @PostMapping("/")
    fun saveSupport(@RequestBody support: Support?): Support? {
        return support?.let { supportService?.saveSupport(it) }
    }

    @GetMapping("/{id}")
    fun findSupportById(@PathVariable("id") supportId: Long?): Support? {
        return supportService?.findSupportById(supportId)
    }

        @PutMapping("/{id}")
    fun updateSupportById(@PathVariable("id") supportId: Long?, @RequestBody support: Support): Support? {
        val userData: Optional<Support> = Optional.ofNullable(supportService?.findSupportById(supportId))
        if (userData.isPresent()) {
            val _support: Support = userData.get()
            _support.setEmail(support.getEmail())
            _support.setPassword(support.getPassword())
            return supportService?.saveSupport(_support)
        }
        return supportService(HttpStatus.NOT_FOUND)
    }

    private fun supportService(notFound: HttpStatus): Support? {
        return supportService(HttpStatus.NOT_FOUND)
    }

    @DeleteMapping("/{id}")
    fun deleteSupportById(@PathVariable("id") supportId: Long?) {
        supportService?.deleteSupportById(supportId)
    }

    @get:GetMapping("/")
    val allsupport: List<Any?>?
        get() {
            val support: List<Support> = ArrayList<Support>()
            return supportService?.getAllSupports()
        }

//    @PostMapping("/signin")
//    fun validateUserOne(@RequestBody support: Support): String? {
//        try {
//            val supportData: Support = supportService?.findSupportByEmail(support.getEmail()) ?: support
//             if ((support.getEmail().contentEquals(supportData.getEmail())) and ( support.getPassword().contentEquals(supportData.getPassword())) ){
//               return "Valid User"
//            }  else {
//               return "Invalid User"
//            }
//        } catch (ex: Exception) {
//           return "Invalid User"
//        }
//    }
        @PostMapping("/signin")
        fun loginSupport(@RequestBody support: Support?): String? {
            return supportService?.loginSupport(support)
}



}