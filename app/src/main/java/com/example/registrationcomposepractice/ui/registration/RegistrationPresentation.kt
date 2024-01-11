package com.example.registrationcomposepractice.ui.registration

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.registrationcomposepractice.R
import com.example.registrationcomposepractice.ui.commonComposables.SpacerMedium
import com.example.registrationcomposepractice.ui.commonComposables.SubmitButton
import com.example.registrationcomposepractice.ui.commonComposables.TextEditCustom

@Composable
@Preview
fun RegistrationPresentation() {
    val viewModel = hiltViewModel<RegistrationPresentationViewModel>()

    var firstName by rememberSaveable { mutableStateOf("") }
    var lastName by rememberSaveable { mutableStateOf ("") }
    var email by rememberSaveable { mutableStateOf ("") }
    var password1 by rememberSaveable { mutableStateOf ("") }
    var password2 by rememberSaveable { mutableStateOf ("") }

    fun submitRegistration() {
        viewModel.registerUser(firstName, lastName, email, password1)
    }

    Column {
        SpacerMedium()

        // first name
        TextEditCustom(
            value = firstName,
            onValueChange = {firstName = it},
            R.string.first_name
        )
        SpacerMedium()

        // last name
        TextEditCustom(
            value = lastName,
            onValueChange = {lastName = it},
            R.string.last_name
        )
        SpacerMedium()

        // email
        TextEditCustom(
            value = email,
            onValueChange = {email = it},
            R.string.email
        )
        SpacerMedium()

        // password 1
        TextEditCustom(
            value = password1,
            onValueChange = {password1 = it},
            R.string.password
        )
        SpacerMedium()

        // password 2
        TextEditCustom(
            value = password2,
            onValueChange = {password2 = it},
            R.string.password2
        )
        SpacerMedium()

        SubmitButton { submitRegistration() }
    }
}
