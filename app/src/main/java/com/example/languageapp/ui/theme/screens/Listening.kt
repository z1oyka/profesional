package com.example.languageapp.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
fun Listening(modifier: Modifier = Modifier,
              navController: NavController = rememberNavController()
) {


    Row(modifier = Modifier
        .fillMaxWidth()
        .height(102.dp)
        .background(Color(0xFF410FA2)),
        verticalAlignment = Alignment.CenterVertically,
    ){

        Button(onClick = {navController.navigate("main")},
            modifier = Modifier
                .padding(top = 25.dp, start = 10.dp)
                .size(17.dp, 27.dp),
            contentPadding = PaddingValues(0.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
        ) {
            Image(painter = painterResource(R.drawable.ic_back),
                contentDescription = "",
                modifier = Modifier.fillMaxSize())
        }
        Spacer(Modifier.width(20.dp))


        Text("Listening",
            fontSize = 22.sp,
            fontFamily = interFontFamily,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(top = 25.dp),
            color = Color.White
        )


    }

    Column(modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(Modifier.height(140.dp))

        Text("cucumber",
            fontSize = 22.sp,
            fontFamily = interFontFamily,
            fontWeight = FontWeight.Medium)

        Text("[ 'kju:kʌmbə ]",
            fontSize = 17.sp,
            fontFamily = interFontFamily)

        Text("Please press button and say this \nword. Our service will check \nyour pronunciation ",
            fontSize = 22.sp,
            fontFamily =interFontFamily,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(top = 50.dp))



        Button(onClick = {
            navController.navigate("listening2")
        },
            modifier = Modifier
                .padding(top = 20.dp)

                .height(56.dp)
                .fillMaxWidth()
                .padding(horizontal = 30.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF5B7AFC))) {
            Text("Check my speech",
                fontSize = 20.sp,
                fontFamily = interFontFamily
            )}
    }

    
}

@Preview
@Composable
private fun ListeninngPrev() {
    Listening()

}