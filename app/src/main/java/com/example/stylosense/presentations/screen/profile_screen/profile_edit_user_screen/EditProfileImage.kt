package com.example.stylosense.presentations.screen.profile_screen.profile_edit_user_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.stylosense.R

@Composable
fun EditProfileImage(modifier: Modifier = Modifier, imgProfile: Int) {
    Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
        Image(
            painter = painterResource(id = R.drawable.circle_photo),
            contentDescription = "Profile Picture",
            modifier = Modifier
                .size(125.dp)
                .clip(CircleShape)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun EditProfileImagePreview() {
    EditProfileImage(
        imgProfile = R.drawable.circle_photo
    )
}