package com.petrubocsanean.pennyflow.infrastructure.repository

import com.petrubocsanean.pennyflow.domain.entities.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserRepository : CrudRepository<User, UUID> {
    fun findByEmail(email: String) : Optional<User>
}