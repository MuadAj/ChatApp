package com.example.chat.ui.singup

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chat.Textfeld
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.example.chat.R
import com.example.chat.ui.destinations.LogInScreenDestination


@Destination
@Composable
fun SingUpScreen(nav: DestinationsNavigator) {


    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Box(
            contentAlignment = Alignment.TopCenter,
            modifier = Modifier.fillMaxSize(),
        )
        {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(painter = painterResource(R.drawable.rectangle_8), contentDescription = "")
            }
            Box(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .background(Color.Transparent)
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(615.dp),
                    shape = RoundedCornerShape(90.dp, 0.dp, 0.dp, 0.dp)

                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(color = Color.White)
                    ) {

                        Column(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally

                        ) {
                            Spacer(modifier = Modifier.height(70.dp))

                            Text(
                                fontSize = 36.sp,
                                fontWeight = FontWeight.Bold,
                                style = TextStyle(Color(0xffff9431)),
                                text = "Sing Up"
                            )
                        }
                        Spacer(modifier = Modifier.height(70.dp))

                        Textfeld()

                        Spacer(modifier = Modifier.height(145.dp))

                        Column(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally

                        ) {
                            Button(
                                modifier = Modifier
                                    .width(315.dp)
                                    .height(58.dp),
                                colors = ButtonDefaults.buttonColors(
                                    backgroundColor = Color(
                                        0xffff9431
                                    )
                                ),
                                onClick = { /*TODO*/ }) {
                                Text(color = Color.White, text = "Sing Up", fontSize = 22.sp)
                            }

                            TextButton(onClick = { nav.navigate(LogInScreenDestination) }

                            )
                            {
                                Text(
                                    buildAnnotatedString {
                                        withStyle(style = SpanStyle(color = Color.Black)) {
                                            append("Do you have a account?  ")
                                        }
                                        append("Login here")
                                    }, color = Color(0xffff9431)
                                )
                            }
                        }
                    }


                }

            }


        }

    }

}