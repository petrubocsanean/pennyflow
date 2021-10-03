package com.petrubocsanean.pennyflow.application.users

import com.petrubocsanean.pennyflow.application.common.exceptions.ResourceNotFound
import com.petrubocsanean.pennyflow.application.common.interfaces.IUserService
import com.petrubocsanean.pennyflow.domain.entities.User
import com.petrubocsanean.pennyflow.infrastructure.repository.UserRepository
import com.petrubocsanean.pennyflow.infrastructure.services.PasswordEncoderService
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService(private val userRepository: UserRepository, private val passwordEncoderService: PasswordEncoderService) : IUserService {
    override fun create(user: User): User {
        encodeUserPassword(user);
        return userRepository.save(user);
    }

    override fun findById(id: UUID): User {
        return userRepository.findById(id).orElseThrow {
            ResourceNotFound()
        };
    }

    override fun findByEmail(email: String): User {
        return userRepository.findByEmail(email).orElseThrow {
            ResourceNotFound()
        }
    }

    private fun encodeUserPassword(user: User) {
        user.password = passwordEncoderService.encode(user.password)
    }

}