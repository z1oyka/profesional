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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.languageapp.R
import com.example.languageapp.ui.theme.interFontFamily
import kotlinx.coroutines.launch

@Composable
fun SelectLanguage(modifier: Modifier = Modifier,
                   navController: NavController = rememberNavController()
) {
    var firstselect by remember { mutableStateOf(true) }
    var secondselect by remember { mutableStateOf(true) }
    var thirdselect by remember { mutableStateOf(true) }
    var fourthselect by remember { mutableStateOf(true) }
    var fiveselect by remember { mutableStateOf(true) }
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(102.dp)
        .background(Color(0xFF410FA2)),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        ){


        Text("Language select",
            fontSize = 17.sp,
            fontFamily = interFontFamily,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(top = 25.dp),
            color = Color.White
        )


    }
    Column(modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(Modifier.height(130.dp))
        Text("What is your Mother language?",
            fontFamily = interFontFamily,
            fontSize = 22.sp,
            fontWeight = FontWeight.Medium)
        Spacer(Modifier.height(20.dp))


        Button(modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp).padding(top = 8.dp)
            .height(67.dp),
            onClick = {firstselect = !firstselect
                      secondselect = true
                      thirdselect = true
                      fourthselect = true
                      fiveselect = true},
            shape = RoundedCornerShape(20.dp),
            contentPadding = PaddingValues(0.dp),
            colors = ButtonDefaults.buttonColors(containerColor = if (firstselect ==true) Color(0xFFFDF4EA)
            else Color(0xFFF56400))
            ) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Text("Russian",
                    modifier = Modifier.padding(start = 15.dp),
                fontFamily = interFontFamily,
                fontSize = 22.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black) }


        }

        Button(modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp).padding(top = 15.dp)
            .height(67.dp),
            onClick = {firstselect = true
                secondselect = !secondselect
                thirdselect = true
                fourthselect = true
                fiveselect = true},
            shape = RoundedCornerShape(20.dp),
            contentPadding = PaddingValues(0.dp),
            colors = ButtonDefaults.buttonColors(containerColor = if (secondselect ==true) Color(0xFFFDF4EA)
            else Color(0xFFF56400))) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Text("English",
                    modifier = Modifier.padding(start = 15.dp),
                    fontFamily = interFontFamily,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.Black) }


        }
        Button(modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp).padding(top = 15.dp)
            .height(67.dp),
            onClick = {firstselect = true
                secondselect = true
                thirdselect = !thirdselect
                fourthselect = true
                fiveselect = true},
            shape = RoundedCornerShape(20.dp),
            contentPadding = PaddingValues(0.dp),
            colors = ButtonDefaults.buttonColors(containerColor = if (thirdselect ==true) Color(0xFFFDF4EA)
            else Color(0xFFF56400))) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Text("Chinese",
                    modifier = Modifier.padding(start = 15.dp),
                    fontFamily = interFontFamily,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.Black) }


        }
        Button(modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp).padding(top = 15.dp)
            .height(67.dp),
            onClick = {firstselect = true
                secondselect = true
                thirdselect = true
                fourthselect = !fourthselect
                fiveselect = true},
            shape = RoundedCornerShape(20.dp),
            contentPadding = PaddingValues(0.dp),
            colors = ButtonDefaults.buttonColors(containerColor = if (fourthselect ==true) Color(0xFFFDF4EA)
            else Color(0xFFF56400))) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Text("Belarus",
                    modifier = Modifier.padding(start = 15.dp),
                    fontFamily = interFontFamily,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.Black) }


        }

        Button(modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp).padding(top = 15.dp)
            .height(67.dp),
            onClick = {firstselect = true
                secondselect = true
                thirdselect = true
                fourthselect = true
                fiveselect = !fiveselect},
            shape = RoundedCornerShape(20.dp),
            contentPadding = PaddingValues(0.dp),
            colors = ButtonDefaults.buttonColors(containerColor = if (fiveselect ==true) Color(0xFFFDF4EA)
            else Color(0xFFF56400))) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Text("Kazakh",
                    modifier = Modifier.padding(start = 15.dp),
                    fontFamily = interFontFamily,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.Black) }


        }
        Spacer(Modifier.height(230.dp))
        Button(
            onClick = {


            },
            modifier =
                Modifier.padding(horizontal = 20.dp).fillMaxWidth().height(56.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF5B7AFC))) {
            Text("Choose",

                fontSize = 23.sp,
                fontFamily = interFontFamily
            )
        }

    }

}