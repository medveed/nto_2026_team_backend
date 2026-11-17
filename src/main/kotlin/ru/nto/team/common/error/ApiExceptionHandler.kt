package ru.nto.team.common.error

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

// TODO: implement domain errors and validation errors. This only makes unfinished routes usable.
@RestControllerAdvice
class ApiExceptionHandler {
    @ExceptionHandler(ApiException::class)
    fun unfinished(error: ApiException): ResponseEntity<Map<String, String>> =
        ResponseEntity.status(error.status).body(mapOf("error" to error.message!!))

    @ExceptionHandler(ApplicationException::class)
    fun handle(e: ApplicationException): ResponseEntity<Map<String, String?>> = when (e) {
        is InvalidCodeFormatException -> error(HttpStatus.BAD_REQUEST, e)
        is StaffNotFoundException -> error(HttpStatus.UNAUTHORIZED, e)
        is InvalidStatusException -> error(HttpStatus.BAD_REQUEST, e)
        is RequestNotFoundException -> error(HttpStatus.NOT_FOUND, e)
        is DuplicateRequestException -> error(HttpStatus.CONFLICT, e)
        is InvalidStatusTransitionException -> error(HttpStatus.CONFLICT, e)
    }

    private fun error(status: HttpStatus, e: ApplicationException) =
        ResponseEntity.status(status).body(mapOf("error" to e.message))
}
