package com.example.languageapp.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.languageapp.R
import com.example.languageapp.ui.theme.interFontFamily

@Composable
fun Profile(modifier: Modifier = Modifier,
            navController: NavController = rememberNavController()
) {


    Row(modifier = Modifier
        .fillMaxWidth()
        .height(231.dp)
        .background(Color(0xFF410FA2)),
        verticalAlignment = Alignment.CenterVertically){


        Column(modifier = Modifier.padding(start = 20.dp)) {

            Image(painter = painterResource(R.drawable.profile),
                contentDescription = "",
                modifier = Modifier.size(134.dp))

            Text("Your profile, Emil",
                fontFamily = interFontFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 22.sp,
                color = Color.White,
                modifier = Modifier.padding(top = 10.dp)

            )
        }



    }
    Column(modifier = Modifier.padding(bottom = 25.dp).fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
        ) {


        Button(onClick = {

        },
            modifier = Modifier
                .padding(horizontal = 20.dp)
                .fillMaxWidth()
                .height(56.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF5B7AFC))) {
            Text("Switch to Dark",
                fontSize = 20.sp,
                fontFamily = interFontFamily
            )}
        Spacer(Modifier.height(10.dp))


        Button(onClick = {

        },
            modifier = Modifier
                .padding(horizontal = 20.dp)
                .fillMaxWidth()
                .height(56.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF5B7AFC))) {
            Text("Change mother language",
                fontSize = 20.sp,
                fontFamily = interFontFamily
            )}
        Spacer(Modifier.height(10.dp))


        Button(onClick = {

        },
            modifier = Modifier
                .padding(horizontal = 20.dp)
                .fillMaxWidth()
                .height(56.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF5B7AFC))) {
            Text("Change your image",
                fontSize = 20.sp,
                fontFamily = interFontFamily
            )}
        Spacer(Modifier.height(10.dp))
        Button(onClick = {

        },
            modifier = Modifier
                .padding(horizontal = 20.dp)
                .fillMaxWidth()
                .height(56.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE4E4E4))) {
            Text("Logout",
                fontSize = 20.sp,
                fontFamily = interFontFamily
            )}






    }
    
}

@Preview
@Composable
private fun ProfilePrev() {
    Profile()

}