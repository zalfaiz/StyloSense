package com.example.stylosense.layouteditprofile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.stylosense.R

@Composable
fun EditProfilePage(modifier: Modifier = Modifier) {
    Scaffold(
        contentColor = Color.White,
        topBar = {
            EditProfileAppbar(
                title = "Edit Profile"
            )
        }
    ) {
        Column(modifier = Modifier.padding(it)) {
            EditProfileImage(
                imgProfile = R.drawable.circle_photo
            )
            EditProfileText(
                title = "Edit Profile"
            )
            EditProfileInfo(
                name = "Name",
                nama = "Ivan Effendy",
                Email = "Email",
                email = "jackson88@gmail.com",
                noHp = "Phone Number",
                phone = "+628214853321"
            )
        }
    }
}

@Preview
@Composable
private fun EditProfilePagePreview() {
    EditProfilePage()
}