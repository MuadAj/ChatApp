package com.example.chat.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.example.chat.R
import com.example.chat.ui.destinations.ContactViweDestination


@Destination
@Composable
fun MainSecreen(nav : DestinationsNavigator){


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(58.dp),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically


        ) {
            Image(
                painter = painterResource(R.drawable.unsplash_tn8dlxwudma),
                contentDescription = ""
            )

            Spacer(modifier = Modifier.padding(55.dp))

            Text(modifier = Modifier, text = "Home", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color.Black)

            Spacer(modifier = Modifier.padding(55.dp))

            FloatingActionButton(
                shape = RoundedCornerShape(30.dp),
                backgroundColor = Color.White,
                onClick = {  }) {

                Image(painter = painterResource(R.drawable.frame__2_), contentDescription = "")

            }



        }

        LazyHome(nav)
    }
}







@Destination
@Composable
fun LazyHome(nav : DestinationsNavigator){

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


            }
        }
        Box(
            modifier = Modifier
                .padding(end = 25.dp, bottom = 25.dp)
                .align(Alignment.BottomEnd)
                .background(Color.Transparent)
        ) {
            FloatingActionButton(
                shape = RoundedCornerShape(30.dp),
                backgroundColor = Color(0xffff8a37),
                onClick = { nav.navigate(ContactViweDestination) }) {

                Image(painter = painterResource(R.drawable.frame__1_), contentDescription = "")

            }
        }

    }
}