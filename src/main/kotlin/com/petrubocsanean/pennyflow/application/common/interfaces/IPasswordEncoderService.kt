package com.petrubocsanean.pennyflow.application.common.interfaces

interface IPasswordEncoderService {
    fun encode(password: String): String
    fun matches(password: String, encodedPassword: String): Boolean
}