package com.example.registrationcomposepractice.ui.registration

import androidx.lifecycle.ViewModel
import com.example.registrationcomposepractice.data.RegistrationInfo
import com.example.registrationcomposepractice.domain.RegisterUserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RegistrationPresentationViewModel @Inject constructor(
    private val registerUserUseCase: RegisterUserUseCase
) : ViewModel() {

    fun registerUser(
        firstName: String,
        lastName: String,
        email: String,
        password: String
    ) {
        val info = RegistrationInfo(
            firstName,
            lastName,
            email,
            password
        )

        registerUserUseCase.registerUser(info)
    }

    companion object {
        const val TAG = "viewModel"
    }
}