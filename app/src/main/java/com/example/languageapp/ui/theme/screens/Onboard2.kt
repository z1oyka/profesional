package com.example.languageapp.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.languageapp.R
import com.example.languageapp.ui.theme.interFontFamily

@Composable
fun OnBoard2(modifier: Modifier = Modifier,
             navController: NavController = rememberNavController()) {
    Column(modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(Modifier.height(200.dp))
        Image(painter = painterResource(R.drawable.illustrations2),
            contentDescription = "",
            modifier = Modifier.size(240.dp,220.dp))
        Spacer(modifier = Modifier.size(120.dp))
        Image(painter = painterResource(R.drawable.loading2),
            contentDescription = "",
            modifier = Modifier.size(40.dp,8.dp))
        Text("Take your time to learn",
            fontSize = 28.sp,
            fontFamily = interFontFamily,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(top = 50.dp))
        Text("Develop a habit of learning and \nmake it a part of your daily routine",
            fontSize = 18.sp,
            fontFamily = interFontFamily,
            color = Color.Gray,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 10.dp)

        )
        Spacer(Modifier.padding(30.dp))
        Button(onClick = {
            navController.navigate("onboard3")
        },
            modifier = Modifier.padding(horizontal = 20.dp).fillMaxWidth().
            height(56.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF5B7AFC))) {
            Text("More",
                fontSize = 23.sp,
                fontFamily = interFontFamily
            )
        }
        Text("Skip onboarding",
            fontSize = 15.sp,
            fontFamily = interFontFamily,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(top = 20.dp))
    }


}