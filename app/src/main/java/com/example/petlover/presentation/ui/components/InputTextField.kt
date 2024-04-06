package com.example.petlover.presentation.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.petlover.R

@Composable
fun InputTextField(
    onTextChange: (name: String) -> Unit
){
    val localFocusManager = LocalFocusManager.current
    var currentValue by remember{ mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = currentValue,
            onValueChange = {
                currentValue = it
                onTextChange(it)
            },
            placeholder = {
                Text(
                    text = stringResource(R.string.input_text_field_component_enter_your_name),
                    fontSize = 18.sp
                    )
            },
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions {
                localFocusManager.clearFocus()
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun InputTextFieldPreview(){
//    InputTextField()
}
