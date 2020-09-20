package com.luxoft.training.easywallet.controller

import com.luxoft.training.easywallet.entity.User
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class HelloController {

    @GetMapping
    @ResponseBody
    fun all(): List<User> {
       return emptyList()
    }

    @PostMapping
    @ResponseBody
    fun createUser(@RequestBody User: User?): ResponseEntity<*>? {
        return ResponseEntity.ok(HttpStatus.OK)
    }
}
