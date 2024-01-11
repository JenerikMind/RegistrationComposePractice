package com.example.registrationcomposepractice.ui.commonComposables

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.registrationcomposepractice.R

@Composable
fun SubmitButton(onClick: () -> Unit){
    Button(onClick = onClick ) {
        Text(text = stringResource(id = R.string.submit))
    }
}