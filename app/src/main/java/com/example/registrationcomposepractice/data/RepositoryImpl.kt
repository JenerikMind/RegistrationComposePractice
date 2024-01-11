package com.example.registrationcomposepractice.data

class RepositoryImpl: Repository {
    override fun registerUser(registrationInfo: RegistrationInfo) : RegistrationResponse {
        return RegistrationResponse.isError("Error 404.  Not Found")
    }
}