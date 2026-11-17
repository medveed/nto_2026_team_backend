package ru.nto.team.common.error

sealed class ApplicationException(message: String) : RuntimeException(message)

// Staff
class InvalidCodeFormatException : ApplicationException("Invalid code format")
class StaffNotFoundException : ApplicationException("Unauthorized")

// Rerquests
class InvalidStatusException : ApplicationException("Invalid status")
class RequestNotFoundException : ApplicationException("Request not found")
class DuplicateRequestException : ApplicationException("Duplicate request")
class InvalidStatusTransitionException : ApplicationException("Invalid status transition")
