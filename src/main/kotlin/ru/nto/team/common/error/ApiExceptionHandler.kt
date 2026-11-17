package ru.nto.team.common.error

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

// TODO: implement domain errors and validation errors. This only makes unfinished routes usable.
@RestControllerAdvice
class ApiExceptionHandler {
    @ExceptionHandler(ApiException::class)
    fun unfinished(error: ApiException): ResponseEntity<Map<String, String>> =
        ResponseEntity.status(error.status).body(mapOf("error" to error.message!!))
}
