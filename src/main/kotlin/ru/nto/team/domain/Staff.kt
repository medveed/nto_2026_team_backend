package ru.nto.team.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

// TODO: connect this class to staff using JPA; id is generated, code is unique.
@Entity
@Table(name = "staff")
class Staff(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(nullable = false, length = 4, unique = true)
    var code: String = "",

    @Column(name = "full_name", nullable = false, length = 150)
    var fullName: String = ""
)