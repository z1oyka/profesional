package com.example.languageapp.ui.theme.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.FloatState
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
fun SplashScreen(modifier: Modifier = Modifier,
                 navController: NavController = rememberNavController()
) {
    Column(modifier = Modifier.clickable{navController.navigate("onboard")}.fillMaxSize().background(color = Color(0xFF410FA2)),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(Modifier.height(300.dp))
        Image(painter = painterResource(R.drawable.book),
            contentDescription = "",
            modifier = Modifier.size(164.dp,152.dp))
        Text("Language App",
            fontSize = 36.sp,
            fontFamily = interFontFamily,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(top = 20.dp),
            color = Color.White,
            lineHeight = 42.sp
        )
    }


}
@Preview
@Composable
private fun SplashPrev() {
    SplashScreen()

}