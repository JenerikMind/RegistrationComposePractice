package com.example.registrationcomposepractice.data

sealed class RegistrationResponse {
    object isLoading : RegistrationResponse()
    class isSuccesful() : RegistrationResponse()
    data class isError(val errorMessage: String) : RegistrationResponse()
}