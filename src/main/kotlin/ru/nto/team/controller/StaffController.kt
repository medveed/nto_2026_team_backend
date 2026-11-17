package ru.nto.team.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import ru.nto.team.service.StaffService

// TODO: complete auth API behavior; this compilable route delegates to an unfinished service.
@RestController
class StaffController(private val service: StaffService) {
    @GetMapping("/api/{code}/auth")
    fun profile(@PathVariable code: String) = service.profile(code)
}