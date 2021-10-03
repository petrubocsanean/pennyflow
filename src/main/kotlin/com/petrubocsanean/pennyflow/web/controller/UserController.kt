package com.petrubocsanean.pennyflow.web.controller

import com.petrubocsanean.pennyflow.application.users.UserService
import com.petrubocsanean.pennyflow.web.dto.UserDto
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(private val userService: UserService) {

    @GetMapping("/users/get")
    fun demoReturn() : String {
        return "demo"
    }

    @PostMapping("users/signup")
    fun signup(@RequestBody @Validated signupUserRequest: UserDto.Request.Signup) : UserDto.Response {
        val user = userService.create(
            UserDto.Request.Signup.toDomain(signupUserRequest)
        )

        return UserDto.Response.fromEntity(user)
    }
}