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
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.languageapp.R
import com.example.languageapp.ui.theme.interFontFamily

@Composable
fun Animals(modifier: Modifier = Modifier) {
    var animal by remember { mutableStateOf("") }
    val lowanimal = animal.lowercase()
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(102.dp)
        .background(Color(0xFF410FA2)),
        verticalAlignment = Alignment.CenterVertically,
    ){

        Button(onClick = {},
            modifier = Modifier.padding(top = 25.dp, start = 10.dp).size(17.dp,27.dp),
            contentPadding = PaddingValues(0.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
        ) {
            Image(painter = painterResource(R.drawable.ic_back),
                contentDescription = "",
                modifier = Modifier.fillMaxSize())
        }
        Spacer(Modifier.width(20.dp))


        Text("Guess the animal",
            fontSize = 22.sp,
            fontFamily = interFontFamily,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(top = 25.dp),
            color = Color.White
        )


    }

    Column(modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
        ) {

        Spacer(Modifier.height(140.dp))

        Image(painter = painterResource(R.drawable.racoon),
            contentDescription = "",
            modifier = Modifier.size(328.dp))



        Spacer(Modifier.height(15.dp))
        Row(modifier = Modifier.width(320.dp)) {
            Text("Write who is on image",
                fontFamily = interFontFamily,
                fontSize = 15.sp)
        }
        TextField(value = animal,
            onValueChange = {animal = it},
            modifier = Modifier.padding(top = 10.dp).width(328.dp),
            shape = RoundedCornerShape(12.dp)
        )

        Button(onClick = {
//            if (lowanimal == "racoon"){navcontroller.navigate("page1")}
//            else{navcontroller.navigate("page1")}


        },
            modifier = Modifier.padding(top = 20.dp)

                .width(328.dp)
                .height(56.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF5B7AFC))) {
            Text("Check",
                fontSize = 20.sp,
                fontFamily = interFontFamily
            )}






    }

}