package com.example.chat.ui.contacts

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ramcosta.composedestinations.annotation.Destination
import com.example.chat.R
import com.example.chat.ui.destinations.ChatScreenDestination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@Composable
fun ContactViwe(nav : DestinationsNavigator) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {


        }

        Lazylist(nav)
    }
}




@Composable
fun Contact() {

    val randomName = listOf<String>(
        ("قطقوط"),
        ("قطيط"),
        ("قطط"),
        ("قطويط"),
        ("يقطقط"),
        ("قطقطق"),
        ("طقيق"),
        ("طقطق")

    )

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp),
        horizontalArrangement = Arrangement.Start
    ) {
        Image(
            painter = painterResource(R.drawable.unsplash_gkxkby_c_dk),
            contentDescription = ""
        )

        Spacer(modifier = Modifier.padding(5.dp))
        Column() {


            Text(modifier = Modifier, text = randomName.random(), fontSize = 14.sp, color = Color.Black)

            Text(modifier = Modifier, text = "", fontSize = 10.sp)
        }
        Spacer(modifier = Modifier.padding(85.dp))

        Text(modifier = Modifier, text = "", fontSize = 10.sp)

    }
}



@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Lazylist(nav : DestinationsNavigator) {

    Box(
        contentAlignment = Alignment.TopCenter,
        modifier = Modifier.fillMaxSize(),

        ) {

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp) //ChatScreenDestination
        ) {

            items(9) { index ->
                Column( modifier = Modifier
                        .fillMaxSize()
                        .padding(vertical = 8.dp)
                        .combinedClickable(onClick = { nav.navigate(ChatScreenDestination) },
                            onLongClick = { })

                ) {
                    Contact()

                }

            }
        }
    }
}