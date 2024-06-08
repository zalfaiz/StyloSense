package com.example.stylosense.layouteditprofile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.stylosense.R

@Composable
fun ProfilePage(modifier: Modifier = Modifier) {
    Scaffold(
        contentColor = Color.White,
        topBar = {
            ProfileTopBar(
                title = "Profile"
            )
        }
    ) {
        Column(modifier = Modifier.padding(it)) {
            ProfileAppBar()
            ProfileImage(
                imgProfile = R.drawable.circle_photo,
            )
            ProfileInfo(
                modifier = Modifier.padding(
                    horizontal = 24.dp,
                    vertical = 8.dp
                ),
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
private fun ProfilePagePreview() {
    ProfilePage()
}