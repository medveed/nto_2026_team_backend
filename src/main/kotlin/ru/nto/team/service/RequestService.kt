package ru.nto.team.service

import org.springframework.stereotype.Service
import ru.nto.team.common.error.ApiException
import ru.nto.team.CreateRequestBody
import ru.nto.team.DecisionBody
import ru.nto.team.dto.response.RequestDetailsDto
import ru.nto.team.dto.response.RequestListDto

@Service
class RequestService {
    fun list(code: String, status: String?): List<RequestListDto> = throw ApiException(501, "Task not implemented")
    fun details(code: String, id: Long): RequestDetailsDto = throw ApiException(501, "Task not implemented")
    fun create(code: String, body: CreateRequestBody): RequestDetailsDto = throw ApiException(
        501,
        "Task not implemented"
    )
    fun cancel(code: String, id: Long): RequestDetailsDto = throw ApiException(501, "Task not implemented")
    fun decide(id: Long, body: DecisionBody): RequestDetailsDto = throw ApiException(501, "Task not implemented")
}