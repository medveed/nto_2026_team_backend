package ru.nto.team.service

import org.springframework.stereotype.Service
import ru.nto.team.common.error.InvalidCodeFormatException
import ru.nto.team.common.error.StaffNotFoundException
import ru.nto.team.common.validation.StaffCodeValidator
import ru.nto.team.domain.Staff
import ru.nto.team.dto.response.ProfileDto
import ru.nto.team.repository.StaffRepository

@Service
class StaffService(
    private val staffRepository: StaffRepository
) {
    fun requireStaff(code: String): Staff {
        if (!StaffCodeValidator.isValid(code)) throw InvalidCodeFormatException()
        return staffRepository.findByCode(code) ?: throw StaffNotFoundException()
    }

    fun profile(code: String): ProfileDto = ProfileDto(requireStaff(code).fullName)
}