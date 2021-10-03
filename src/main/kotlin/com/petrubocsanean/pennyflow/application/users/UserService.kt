package com.petrubocsanean.pennyflow.application.users

import com.petrubocsanean.pennyflow.application.common.interfaces.IUserService
import com.petrubocsanean.pennyflow.domain.entities.User
import com.petrubocsanean.pennyflow.infrastructure.repository.UserRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService(private val userRepository: UserRepository) : IUserService {
    override fun create(user: User): User {
        return userRepository.save(user);
    }

    override fun findById(id: UUID): User {
        TODO("Not yet implemented")
    }

    override fun findByEmail(email: String): User {
        TODO("Not yet implemented")
    }

}