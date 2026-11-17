package ru.nto.team.common.error

class ApiException(val status: Int, message: String) : RuntimeException(message)