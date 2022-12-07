package dev.labsitiny.commerce.user.customer

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController {
    @GetMapping
    fun getUser(@RequestParam("userId") userId : Int) = "Hello $userId"
}