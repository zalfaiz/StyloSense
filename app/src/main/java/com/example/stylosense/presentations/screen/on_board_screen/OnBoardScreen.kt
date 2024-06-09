package com.example.stylosense.presentations.screen.on_board_screen

import android.annotation.SuppressLint
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.with
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.stylosense.R
import com.example.stylosense.presentations.commons.widgets.CustomDefaultBtn
import com.example.stylosense.presentations.graph.auth.AuthScreen
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState


@SuppressLint("UnusedContentLambdaTargetStateParameter")
@OptIn(ExperimentalPagerApi::class, ExperimentalAnimationApi::class)
@Composable
fun SplashScreen(navController: NavController) {
    val splashImageList = listOf(
        R.drawable.splash_1,
        R.drawable.splash_2,
        R.drawable.splash_3,
    )
    val currentPosition = remember { mutableStateOf(0) }
    val animate = remember { mutableStateOf(true) }
    val pagerState = rememberPagerState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        AnimatedContent(
            targetState = animate.value,
            modifier = Modifier
                .fillMaxWidth(),
            transitionSpec = {
                slideInHorizontally(
                    initialOffsetX = { value ->
                        value
                    }
                ) with slideOutHorizontally(
                    targetOffsetX = { value ->
                        -value
                    }
                )
            },
            content = {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.6f)
                        .padding(top = 10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(
                        text = "StyloSense",
                        fontSize = 50.sp,
                        color = MaterialTheme.colorScheme.primary,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily(Font(R.font.muli_bold)),
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    when (currentPosition.value) {
                        0 -> {
                            Column {
//                                Text(
//                                    text = buildAnnotatedString {
//                                        append(text = "Welcome to ")
//                                        withStyle(
//                                            style = SpanStyle(
//                                                fontWeight = FontWeight.Bold,
//                                                color = MaterialTheme.colorScheme.primary,
//                                            )
//                                        ) {
//                                            append("StyloSense.")
//                                        }
////                                    append(" Let's Shop!")
//                                    },
//                                    color = MaterialTheme.colorScheme.primary,
//                                    fontSize = 18.sp,
//                                    textAlign = TextAlign.Center,
//                                    fontFamily = FontFamily(Font(R.font.muli)),
//                                )
                                Text(
                                    text = buildAnnotatedString {
                                        append(text = "The all in one app for your clothes and laundry lorem  i believe i can fly 1")
//                                        withStyle(
//                                            style = SpanStyle(
//                                                fontWeight = FontWeight.Bold,
//                                                color = MaterialTheme.colorScheme.primary,
//                                            )
//                                        ) {
//                                            append("StyloSense.")
//                                        }
//                                    append(" Let's Shop!")
                                    },
                                    color = MaterialTheme.colorScheme.primary,
                                    fontSize = 18.sp,
                                    textAlign = TextAlign.Center,
                                    fontFamily = FontFamily(Font(R.font.muli)),
                                )
                            }
                        }
                        1 -> {
                            Text(
                                text = "The all in one app for your clothes and laundry lorem  i believe i can fly 2",
                                color = MaterialTheme.colorScheme.primary,
                                fontSize = 18.sp,
                                textAlign = TextAlign.Center
                            )
                        }
                        else -> {
                            Text(
                                text = "The all in one app for your clothes and laundry lorem  i believe i can fly 3",
                                color = MaterialTheme.colorScheme.primary,
                                fontSize = 18.sp,
                                textAlign = TextAlign.Center
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(30.dp))

                    Image(
                        painter = painterResource(id = splashImageList[currentPosition.value]),
                        contentDescription = "Splash Image",
                        modifier = Modifier.fillMaxSize(),
//                        Modifier.padding(40.dp),
                        alignment = Alignment.Center,
                        contentScale =
//                        ContentScale.FillWidth
                        androidx.compose.ui.layout.ContentScale.FillBounds
                    )
                }
            }
        )


        DotIndicator(splashImageList.size, currentPosition.value)

        CustomDefaultBtn(btnText = "Continue", shapeSize = 10f) {
            if (currentPosition.value < 2) {
                currentPosition.value++
                animate.value = !animate.value
            } else {
                navController.navigate(AuthScreen.SignInScreen.route)
            }
        }
    }
}