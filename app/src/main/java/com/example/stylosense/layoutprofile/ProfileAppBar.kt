package com.example.stylosense.layouteditprofile

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.stylosense.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileAppBar(modifier: Modifier = Modifier) {
    TopAppBar(title = {
        Row(modifier = Modifier, horizontalArrangement = Arrangement.Center) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_edit),
                    contentDescription = "Edit Profile"
                )
            }
        }
    },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_logout),
                    contentDescription = "Logout"
                )
            }
        })
}

@Preview
@Composable
private fun ProfileAppBarPreview() {
    ProfileAppBar()
}