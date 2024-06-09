package com.example.stylosense.presentations.screen.profile_screen.profile_edit_user_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun EditProfileInfo(
    modifier: Modifier = Modifier,
    nama: String,
    Email: String,
    noHp: String,
    name: String,
    email: String,
    phone: String
) {
    Column(modifier = Modifier.padding(
        horizontal = 24.dp,
        vertical = 8.dp
    )) {
        Text(
            text = name, style = MaterialTheme.typography.bodySmall.copy(
                fontWeight = FontWeight.W700
            )
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = nama, style = MaterialTheme.typography.bodySmall)
//        HorizontalDivider()
        Spacer(modifier = Modifier.height(14.dp))

        Text(
            text = Email, style = MaterialTheme.typography.bodySmall.copy(
                fontWeight = FontWeight.W700
            )
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = email, style = MaterialTheme.typography.bodySmall)
//        HorizontalDivider()
        Spacer(modifier = Modifier.height(14.dp))

        Text(
            text = noHp, style = MaterialTheme.typography.bodySmall.copy(
                fontWeight = FontWeight.W700
            )
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = phone, style = MaterialTheme.typography.bodySmall)
//        HorizontalDivider()
    }
}

@Preview(showBackground = true)
@Composable
private fun EditProfileInfoPreview() {
    EditProfileInfo(
        name = "Name",
        nama = "Ivan Effendy",
        Email = "Email",
        email = "jackson88@gmail.com",
        noHp = "Phone Number",
        phone = "+628214853321"
    )
}