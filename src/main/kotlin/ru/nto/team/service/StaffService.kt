package ru.nto.team.service

import org.springframework.stereotype.Service
import ru.nto.team.common.error.ApiException
import ru.nto.team.dto.response.ProfileDto

@Service
class StaffService {
    fun profile(code: String): ProfileDto = throw ApiException(501, "Task not implemented")
}