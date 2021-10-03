package com.petrubocsanean.pennyflow.application.common.interfaces

import com.petrubocsanean.pennyflow.domain.entities.User
import java.util.*

interface IUserService {
    fun create(user: User) : User
    fun findById(id: UUID): User
    fun findByEmail(email: String): User
}