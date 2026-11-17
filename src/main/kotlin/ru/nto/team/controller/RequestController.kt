package ru.nto.team.controller

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import ru.nto.team.CreateRequestBody
import ru.nto.team.service.RequestService

// TODO: complete request API behavior, responses and errors.
@RestController
@RequestMapping("/api/{code}/requests")
class RequestController(private val service: RequestService) {
    @GetMapping
    fun list(@PathVariable code: String, @RequestParam(required = false) status: String?) = service.list(code, status)
    @GetMapping("/{id}") fun details(@PathVariable code: String, @PathVariable id: Long) = service.details(code, id)
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@PathVariable code: String, @RequestBody body: CreateRequestBody) = service.create(code, body)
    @PostMapping("/{id}/cancel")
    fun cancel(@PathVariable code: String, @PathVariable id: Long) = service.cancel(code, id)
}