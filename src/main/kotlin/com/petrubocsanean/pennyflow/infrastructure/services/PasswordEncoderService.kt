package com.petrubocsanean.pennyflow.infrastructure.services

import com.petrubocsanean.pennyflow.application.common.interfaces.IPasswordEncoderService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service

@Service
class PasswordEncoderService : IPasswordEncoderService {
    private val bCryptEncoder = BCryptPasswordEncoder()

    override fun encode(password: String): String {
        return bCryptEncoder.encode(password);
    }

    override fun matches(password: String, encodedPassword: String): Boolean {
        return bCryptEncoder.matches(password, encodedPassword);
    }
}