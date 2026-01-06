package com.example.languageapp.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.languageapp.R
import com.example.languageapp.ui.theme.interFontFamily

@Composable
fun Nointernet(modifier: Modifier = Modifier,
               navController: NavController = rememberNavController()
) {

    Row(modifier = Modifier.fillMaxWidth().height(92.dp).background(color = Color(0xFF410FA2))) { }
    Column(modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(Modifier.height(260.dp))
        Image(painter = painterResource(R.drawable.emote),
            contentDescription = "",
            modifier = Modifier.size(140.dp))
        Text("No \ninternet connection",
            modifier = Modifier.padding(top = 40.dp),
            fontSize = 30.sp,
            fontWeight = FontWeight.Medium,
            fontFamily = interFontFamily,
            textAlign = TextAlign.Center
            )
        Spacer(Modifier.height(300.dp))
        Button(onClick = {navController.navigate("splash")},
            modifier = Modifier.padding(horizontal = 20.dp).fillMaxWidth().
            height(56.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF5B7AFC))) {
            Text("Check again",
                fontSize = 23.sp,
                fontFamily = interFontFamily
                )
        }
    }
    
}