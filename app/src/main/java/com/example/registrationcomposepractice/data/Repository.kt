package com.example.registrationcomposepractice.data

interface Repository {
    fun registerUser(registrationInfo: RegistrationInfo): RegistrationResponse
}