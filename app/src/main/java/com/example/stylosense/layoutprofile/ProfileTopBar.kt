package com.example.stylosense.layouteditprofile

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.stylosense.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileTopBar(modifier: Modifier = Modifier, title: String = "") {

    TopAppBar(title = {
        Row(modifier = Modifier, horizontalArrangement = Arrangement.Center) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_backward),
                    contentDescription = "Edit Profile"
                )
            }
        }
        Text(
            text = title, style = MaterialTheme.typography.titleLarge.copy(
                fontWeight = FontWeight.W700
            )
        )
    })
}

@Preview
@Composable
private fun ProfileTopBarPreview() {
    ProfileTopBar(
        title = "Profile"
    )
}

