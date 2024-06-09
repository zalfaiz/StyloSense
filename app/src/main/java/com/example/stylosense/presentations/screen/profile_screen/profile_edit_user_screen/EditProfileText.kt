package com.example.stylosense.presentations.screen.profile_screen.profile_edit_user_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun EditProfileText(modifier: Modifier = Modifier, title: String) {
    Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
        Text(text = "Edit Profile", style = MaterialTheme.typography.titleMedium.copy(
            fontWeight = FontWeight.W500
        ) )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun EditProfileTextPreview() {
    EditProfileText(
        title = "Edit Profile"
    )
}