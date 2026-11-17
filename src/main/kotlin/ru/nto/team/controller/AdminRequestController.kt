package ru.nto.team.controller

import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import ru.nto.team.DecisionBody
import ru.nto.team.service.RequestService

// TODO: decision behavior. The admin-key check is already protected infrastructure.
@RestController
class AdminRequestController(private val service: RequestService) {
    @PatchMapping("/api/admin/requests/{id}")
    fun decide(@PathVariable id: Long, @RequestBody body: DecisionBody) = service.decide(id, body)
}