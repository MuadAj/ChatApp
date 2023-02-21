package com.example.chat.ui.chat

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Send
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chat.R
import com.example.chat.ui.destinations.ContactViweDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator


@Destination
@Composable
fun ChatScreen(nav: DestinationsNavigator) {

    var msg by remember {
        mutableStateOf("")
    }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(58.dp)
        ) {
            chatContent(nav)
        }

        Box(
            contentAlignment = Alignment.TopCenter,
            modifier = Modifier.fillMaxSize(),

            ) {

            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(15.dp),
            ) {

                items(9) { index ->
                    Contact()
                }
            }

            Box(
                modifier = Modifier
                    .padding(end = 25.dp, bottom = 15.dp)
                    .align(Alignment.BottomCenter)
                    .background(Color.Transparent)
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically

                ) {


                    FloatingActionButton(
                        shape = RoundedCornerShape(30.dp),
                        backgroundColor = Color.White,
                        onClick = { }) {

                        Icon(
                            imageVector = Icons.Rounded.Add,
                            contentDescription = "",
                            tint = Color(0xffff8a37)
                        )
                    }

                    Spacer(modifier = Modifier.padding(2.dp))

                    OutlinedTextField(
                        modifier = Modifier
                            .background(color = Color(0xfff6f7fb))
                            .width(280.dp)
                            .clip(RoundedCornerShape(25.dp)),
                        value = msg,
                        textStyle = TextStyle(color = Color.Black),
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            focusedBorderColor = Color.Transparent,
                            unfocusedBorderColor = Color.Transparent
                        ),
                        onValueChange = { msg = it },
//            label = { Text(style = TextStyle(Color(0xff9A9A9A)), text = "Email address") },
                        placeholder = {
                            Text(
                                style = TextStyle(Color(0xff9A9A9A)),
                                text = "Type something....."
                            )
                        },
                    )

                    Spacer(modifier = Modifier.padding(2.dp))

                    FloatingActionButton(
                        shape = RoundedCornerShape(30.dp),
                        backgroundColor = Color.White,
                        onClick = { }) {

                        Icon(
                            imageVector = Icons.Rounded.Send,
                            contentDescription = "",
                            tint = Color(0xffff8a37)
                        )
                    }
                }

            }


        }

    }
}


@Destination
@Composable
fun chatContent(nav: DestinationsNavigator) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(58.dp),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically

    ) {
        FloatingActionButton(
            shape = RoundedCornerShape(30.dp),
            backgroundColor = Color.White,
            onClick = { nav.navigate(ContactViweDestination) }) {

            Icon(
                imageVector = Icons.Rounded.ArrowBack,
                contentDescription = "",
                tint = Color(0xff9A9A9A)
            )
        }

        Spacer(modifier = Modifier.padding(5.dp))

        Image(
            painter = painterResource(R.drawable.unsplash_gkxkby_c_dk),
            contentDescription = ""
        )

        Spacer(modifier = Modifier.padding(5.dp))

        Column() {


            Text(modifier = Modifier, text = "Name", fontSize = 14.sp, color = Color.Black)

            Text(modifier = Modifier, text = "Online", fontSize = 10.sp, color = Color(0xffff8a37))
        }

        Spacer(modifier = Modifier.padding(60.dp))

        FloatingActionButton(
            shape = RoundedCornerShape(30.dp),
            backgroundColor = Color.White,
            onClick = { }) {

            Image(
                painter = painterResource(R.drawable.vector),
                contentDescription = ""
            )
        }

        Spacer(modifier = Modifier.padding(5.dp))

        FloatingActionButton(
            shape = RoundedCornerShape(30.dp),
            backgroundColor = Color.White,
            onClick = { }) {

            Icon(
                imageVector = Icons.Rounded.Call,
                contentDescription = "",
                tint = Color(0xff9A9A9A)
            )
        }

    }
}





@Composable
fun Contact() {

    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Start
    ) {
        Column(modifier = Modifier
            .fillMaxWidth()
        ) {
            Card() {

                Text(
                    modifier = Modifier,
                    text = "gfdv,;d.;sd.c;'dsc",
                    fontSize = 14.sp,
                    color = Color(0xffff8a37)
                )

            }

        }


        Spacer(modifier = Modifier.padding(10.dp))

        Column(modifier = Modifier
            .fillMaxWidth()
        ) {
            Card() {

                Text(
                    modifier = Modifier,
                    text = "fdvfdvhgukukfgasdgr",
                    fontSize = 14.sp,
                    color = Color(0xff9A9A9A)
                )

            }

        }


    }
}