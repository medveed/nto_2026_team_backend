package ru.nto.team.common.validation

object StaffCodeValidator {
    private val FORMAT = Regex("^[a-zA-Z0-9]{4}")

    fun isValid(code: String) = FORMAT.matches(code)
}