package com.example.languageapp.ui.theme.screens

import android.graphics.Paint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.languageapp.R
import com.example.languageapp.ui.theme.interFontFamily

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LogIn(modifier: Modifier = Modifier,
          navController: NavController = rememberNavController()) {
    var text by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var isPasswordVisible by remember { mutableStateOf(false) }
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(102.dp)
        .background(Color(0xFF410FA2)),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically){
        Button(onClick = {navController.navigate("onboard")},
            modifier = Modifier
                .padding(start = 10.dp, top = 25.dp)
                .size(20.dp),
            contentPadding = PaddingValues(0.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
        ) {Image(painter = painterResource(R.drawable.back),
            contentDescription = "",
            modifier = Modifier.fillMaxSize()) }

        Text("Login",
            fontSize = 17.sp,
            fontFamily = interFontFamily,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(top = 25.dp),
            color = Color.White
        )
        Text("")

    }
    Column(modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(Modifier.height(200.dp))
        Image(painter = painterResource(R.drawable.learathome),
            contentDescription = "",
            modifier = Modifier.size(105.dp,82.dp))
        Text("For free, join now and \nstart learning",
            fontSize = 22.sp,
            fontFamily = interFontFamily,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(top = 20.dp),
            textAlign = TextAlign.Center)
        Spacer(Modifier.height(30.dp))
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp)){
            Text(
                "Email Address",
                fontSize = 15.sp,
                fontFamily = interFontFamily,
                color = Color(0xFF363B44),
                textAlign = TextAlign.Start)
        }
        TextField(value = text,
            onValueChange = {text},
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .padding(top = 5.dp),
            label = { Text("Email", fontFamily = interFontFamily,
                color = Color.Gray) })
        Spacer(Modifier.padding(top = 20.dp))

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp)){
            Text(
                "Password",
                fontSize = 15.sp,
                fontFamily = interFontFamily,
                color = Color(0xFF363B44),
                textAlign = TextAlign.Start)
        }

        TextField(value = password,
            onValueChange = {password},
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .padding(top = 5.dp),
            label = { Text("Password", fontFamily = interFontFamily,
                color = Color.Gray) },
            visualTransformation = if (isPasswordVisible) {
                VisualTransformation.None
            } else {
                PasswordVisualTransformation()
            },
            trailingIcon =
                {
                    IconButton(onClick = {
                        isPasswordVisible = !isPasswordVisible
                    },
                        modifier = Modifier.size(16.dp)) {
                        Icon(
                            painter = painterResource(R.drawable.eye),
                            contentDescription = "",
                            modifier = Modifier.size(16.dp)
                        )
                    }

    })
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, top = 10.dp)){
            Text(
                "Forgot Password",
                fontSize = 15.sp,
                fontFamily = interFontFamily,
                color = Color.Red,
                textAlign = TextAlign.Start)
        }
        Spacer(Modifier.height(40.dp))

        Button(onClick = {navController.navigate("main")},
            modifier = Modifier
                .padding(horizontal = 20.dp)
                .fillMaxWidth()
                .height(56.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF5B7AFC))) {
            Text("Login",
                fontSize = 20.sp,
                fontFamily = interFontFamily
            )}
        Row(modifier = Modifier.padding(top = 25.dp)) {
            Text("Not you member?",
                fontFamily = interFontFamily,
                fontSize = 16.sp,
                color = Color.Gray,
                fontWeight = FontWeight.Medium)

            Text("Signup",
                fontFamily = interFontFamily,
                fontSize = 16.sp,
                color = Color(0xFF5B7AFC),
                fontWeight = FontWeight.Medium,
                modifier = Modifier
                    .clickable {
                        navController.navigate("signup")
                    }
                    .padding(start = 3.dp))
        }

}}

@Preview
@Composable
private fun LoginPrev() {
    LogIn()

}