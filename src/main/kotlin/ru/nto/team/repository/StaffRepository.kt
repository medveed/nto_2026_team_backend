package ru.nto.team.repository

import org.springframework.data.jpa.repository.JpaRepository
import ru.nto.team.domain.Staff

interface StaffRepository : JpaRepository<Staff, Long> {
    fun findByCode(code: String): Staff?
}