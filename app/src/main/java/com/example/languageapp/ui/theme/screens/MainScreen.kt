package com.example.languageapp.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.languageapp.R
import com.example.languageapp.ui.theme.interFontFamily
import java.nio.file.WatchEvent

@Composable
fun MainScreen(modifier: Modifier = Modifier) {

    Row(modifier = Modifier
        .fillMaxWidth()
        .height(175.dp)
        .background(Color(0xFF410FA2)),
        verticalAlignment = Alignment.CenterVertically){

        Column(modifier = Modifier.padding(start = 20.dp)) {
            Spacer(Modifier.height(20.dp))
            Image(painter = painterResource(R.drawable.round),
                contentDescription = "",
                modifier = Modifier.size(54.dp))



            Text("Hello, Emil",
                fontFamily = interFontFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 22.sp,
                color = Color.White,
                modifier = Modifier.padding(top = 10.dp)

            )
            Spacer(Modifier.height(8.dp))

            Text("Are you ready for learning today?",
                fontFamily = interFontFamily,
                fontSize = 17.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Gray)
        }


    }

    Column(modifier = Modifier.fillMaxWidth()) {
        Spacer(Modifier.height(200.dp))
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp)) {
            Text("Top users",
                fontFamily = interFontFamily,
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium)
        }

            Row(modifier = Modifier.padding(horizontal = 20.dp)
                .padding(top = 20.dp)
                .fillMaxWidth()
                .height(64.dp)
                .background(Color(0xFFE4E4E4),shape = RoundedCornerShape(13.dp)),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                ) {
                Image(painter = painterResource(R.drawable.paint),
                    contentDescription = "",
                    modifier = Modifier.padding(start = 10.dp).size(40.dp,30.dp))


                Text("Vincent van Gogh",
                    fontFamily = interFontFamily,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.Black)
                Text("12 points",
                    fontFamily = interFontFamily,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.Black,
                    modifier = Modifier.padding(end = 10.dp))

        }

        Row(modifier = Modifier.padding(horizontal = 20.dp)
            .padding(top = 10.dp)
            .fillMaxWidth()
            .height(64.dp)
            .background(Color(0xFFE4E4E4),shape = RoundedCornerShape(13.dp)),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(painter = painterResource(R.drawable.chemistr),
                contentDescription = "",
                modifier = Modifier.padding(start = 10.dp).size(40.dp,30.dp))


            Text("Dmitri Ivanovich \nMendeleev",
                fontFamily = interFontFamily,
                fontSize = 17.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black)
            Text("10 points",
                fontFamily = interFontFamily,
                fontSize = 17.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black,
                modifier = Modifier.padding(end = 10.dp))

        }


        Row(modifier = Modifier.padding(horizontal = 20.dp)
            .padding(top = 10.dp)
            .fillMaxWidth()
            .height(64.dp)
            .background(Color(0xFFE4E4E4),shape = RoundedCornerShape(13.dp)),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(painter = painterResource(R.drawable.vamp),
                contentDescription = "",
                modifier = Modifier.padding(start = 10.dp).size(40.dp,30.dp))


            Text("Vlad Tepes",
                fontFamily = interFontFamily,
                fontSize = 17.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black)
            Text("8 points",
                fontFamily = interFontFamily,
                fontSize = 17.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black,
                modifier = Modifier.padding(end = 10.dp))

        }

        Row(modifier = Modifier.fillMaxWidth().padding(top = 17.dp, start = 20.dp)) {
            Text("Available excersises",
                fontFamily = interFontFamily,
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium)
        }
        Spacer(Modifier.height(17.dp))


        Row(modifier = Modifier.padding(horizontal = 20.dp).fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween) {
            Button(onClick = {},
                modifier = Modifier.size(153.dp,117.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF5A79F9)),
                shape = RoundedCornerShape(20.dp),
                contentPadding = PaddingValues(0.dp)) {
                Column() {
                    Image(painter = painterResource(R.drawable.mouse),
                        contentDescription = "",
                        modifier = Modifier.size(90.dp))
                    Text("Guess the animal",
                        fontFamily = interFontFamily,
                        fontSize = 13.sp,
                        color = Color.White,
                        modifier = Modifier.padding(bottom = 10.dp))
                }
            }

            Button(onClick = {},
                modifier = Modifier.size(153.dp,117.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFD5185D)),
                shape = RoundedCornerShape(20.dp),
                contentPadding = PaddingValues(0.dp)) {
                Column() {
                    Image(painter = painterResource(R.drawable.pen),
                        contentDescription = "",
                        modifier = Modifier.size(90.dp))
                    Text("Word practice",
                        fontFamily = interFontFamily,
                        fontSize = 13.sp,
                        color = Color.White,
                        modifier = Modifier.padding(bottom = 10.dp))
                }
            }
        }
        Spacer(Modifier.height(20.dp))

        Row(modifier = Modifier.padding(horizontal = 20.dp).fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween) {
            Button(onClick = {},
                modifier = Modifier.size(153.dp,117.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF36300)),
                shape = RoundedCornerShape(20.dp),
                contentPadding = PaddingValues(0.dp)) {
                Column(modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(painter = painterResource(R.drawable.micro),
                        contentDescription = "",
                        modifier = Modifier.size(90.dp))
                    Text("Audition",
                        fontFamily = interFontFamily,
                        fontSize = 13.sp,
                        color = Color.White,
                        modifier = Modifier.padding(bottom = 10.dp))
                }
            }

            Button(onClick = {},
                modifier = Modifier.size(153.dp,117.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF5BA78F)),
                shape = RoundedCornerShape(20.dp),
                contentPadding = PaddingValues(0.dp)) {
                Column(modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(painter = painterResource(R.drawable.game),
                        contentDescription = "",
                        modifier = Modifier.size(90.dp))
                    Text("Game",
                        fontFamily = interFontFamily,
                        fontSize = 13.sp,
                        color = Color.White,
                        modifier = Modifier.padding(bottom = 10.dp))
                }
            }
        }
    }
    
}

@Preview
@Composable
private fun MainPrev() {
    MainScreen()
    
}