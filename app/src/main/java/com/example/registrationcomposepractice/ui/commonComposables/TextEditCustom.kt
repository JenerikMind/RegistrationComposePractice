package com.example.registrationcomposepractice.ui.commonComposables

import android.content.res.Resources
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun TextEditCustom(
    value: String,
    onValueChange: (String) -> Unit,
    labelId: Int
) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        modifier = Modifier
            .padding(horizontal = 26.dp)
            .fillMaxWidth(),
        label = { Text(stringResource(id = labelId))  }
    )
}