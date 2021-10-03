package com.petrubocsanean.pennyflow.domain.entities

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "users")
data class User(
    @Id
    val id: UUID = UUID.randomUUID(),
    val name: String,
    val email: String,
    var password: String,
    val token: String? = null,
    val photoUrl: String? = null
)
