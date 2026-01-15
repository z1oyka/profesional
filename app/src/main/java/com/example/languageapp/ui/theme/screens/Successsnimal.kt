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
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.languageapp.R
import com.example.languageapp.ui.theme.interFontFamily
import java.nio.file.WatchEvent

@Composable
fun Succes(modifier: Modifier = Modifier,
           navController: NavController = rememberNavController()
) {


    Row(modifier = Modifier
        .fillMaxWidth()
        .height(102.dp)
        .background(Color(0xFF5BA78F)),
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


        Text("Guess the animal",
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
        Image(painter =painterResource(R.drawable.success),
            contentDescription = "",
            modifier = Modifier.size(160.dp))





        Text("Holy Molly! That is Right!",
            fontFamily = interFontFamily,
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(top = 40.dp))





    }

    Column(modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(Modifier.height(400.dp))


        Button(onClick = {
            navController.navigate("main")



        },
            modifier = Modifier

                .width(328.dp)
                .height(56.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF5B7AFC))) {
            Text("Next",
                fontSize = 20.sp,
                fontFamily = interFontFamily
            )}
    }
    
}

@Preview
@Composable
private fun SuccesssPrev() {
    Succes()

}