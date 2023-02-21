package com.example.chat


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Send
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chat.ui.NavGraphs
import com.example.chat.ui.contacts.Contact
import com.example.chat.ui.theme.ChatTheme
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.annotation.Destination


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChatTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    DestinationsNavHost(navGraph = NavGraphs.root)
                }
            }
        }
    }
}


@Composable
fun Textfeld() {
    var text by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        OutlinedTextField(
            modifier = Modifier
                .background(color = Color(0xfff6f7fb))
                .clip(RoundedCornerShape(5.dp)),
            value = text,
            textStyle = TextStyle(color = Color.Black),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xffff9431),
                unfocusedBorderColor = Color(0xfff6f7fb)
            ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "emailIcon", tint = Color(0xff9A9A9A)
                )
            },
            onValueChange = { text = it },
//            label = { Text(style = TextStyle(Color(0xff9A9A9A)), text = "Email address") },
            placeholder = {
                Text(
                    style = TextStyle(Color(0xff9A9A9A)),
                    text = "Enter your e-mail"
                )
            },
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            modifier = Modifier
                .background(color = Color(0xfff6f7fb))
                .clip(RoundedCornerShape(5.dp)),
            value = text,
            textStyle = TextStyle(color = Color.Black),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xffff9431)
            ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "Password", tint = Color(0xff9A9A9A)
                )
            },
            onValueChange = { text = it },
//            label = { Text(style = TextStyle(Color(0xff9A9A9A)),text = "Password") },
            placeholder = {
                Text(
                    style = TextStyle(Color(0xff9A9A9A)),
                    text = "Enter your password"
                )
            },
//            trailingIcon = IconButton( onClick = { /*TODO*/ },
//                Image(painter = painterResource(R.drawable.frame), contentDescription = "" , tint = Color(0xffc5c5c7))
//            ){
//
//            }
        )
    }
}





@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ChatTheme {

    }
}