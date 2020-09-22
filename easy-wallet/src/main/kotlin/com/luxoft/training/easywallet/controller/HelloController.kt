package com.luxoft.training.easywallet.controller

import com.luxoft.training.easywallet.entity.User
import com.luxoft.training.msa.platform.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class HelloController(private val userService: UserService) {

    @GetMapping
    @ResponseBody
    fun message():String {
        return userService.message()
    }

    @PostMapping
    @ResponseBody
    fun createUser(@RequestBody User: User?): ResponseEntity<*>? {
        return ResponseEntity.ok(HttpStatus.OK)
    }
}
