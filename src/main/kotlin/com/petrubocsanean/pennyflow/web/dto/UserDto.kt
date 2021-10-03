package com.petrubocsanean.pennyflow.web.dto

import com.fasterxml.jackson.annotation.JsonRootName
import com.petrubocsanean.pennyflow.domain.entities.User
import com.sun.istack.NotNull

@JsonRootName("user")
sealed class UserDto {
    sealed class Request : UserDto() {
        data class Signup(
            @get:NotNull val name: String,
            @get:NotNull val email: String,
            @get:NotNull val password: String
        ) : Request() {
            companion object {
                fun toDomain(userDto: Signup) : User {
                    return  User(
                        name = userDto.name,
                        email = userDto.email,
                        password = userDto.password
                    )
                }
            }
        }
    }

    class Response(
        val name: String,
        val email: String,
        val token: String?,
        val photoUrl: String?
    ) : UserDto() {
        companion object {
            fun fromEntity(user: User) : Response {
                return Response(
                    name = user.name,
                    email = user.email,
                    token = user.token,
                    photoUrl = user.photoUrl
                )
            }
        }
    }
}