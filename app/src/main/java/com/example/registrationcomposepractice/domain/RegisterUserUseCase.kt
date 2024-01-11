package com.example.registrationcomposepractice.domain

import android.util.Log
import com.example.registrationcomposepractice.ui.registration.RegistrationPresentationViewModel
import com.example.registrationcomposepractice.data.RegistrationInfo
import com.example.registrationcomposepractice.data.RegistrationResponse
import com.example.registrationcomposepractice.data.Repository
import javax.inject.Inject

class RegisterUserUseCase @Inject constructor(
    private val repository: Repository
) {
    fun registerUser(info: RegistrationInfo){
        when (val response = repository.registerUser(info)) {
            is RegistrationResponse.isError -> {
                // womp womp
                Log.d(
                    RegistrationPresentationViewModel.TAG,
                    "registerUser: OH NOES ${response.errorMessage}"
                )
            }

            is RegistrationResponse.isSuccesful -> {
                // move to home screen
                Log.d(
                    RegistrationPresentationViewModel.TAG,
                    "registerUser: Congrats, you're now ONE OF US."
                )
            }

            is RegistrationResponse.isLoading -> {
                // display loading spinner?
                Log.d(
                    RegistrationPresentationViewModel.TAG,
                    "registerUser: Still waiting to see if you pass muster..."
                )
            }
        }
    }

}