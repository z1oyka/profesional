package com.example.languageapp.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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

@Composable
fun SignUpPassword(modifier: Modifier = Modifier,
                   navController: NavController = rememberNavController()) {
    var password by remember { mutableStateOf("") }
    var confirmpassword by remember { mutableStateOf("") }
    var isPasswordVisible by remember { mutableStateOf(false) }
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(102.dp)
        .background(Color(0xFF410FA2)),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically){


        Button(onClick = {navController.navigate("signup")},
            modifier = Modifier
                .padding(start = 10.dp, top = 25.dp)
                .size(20.dp),
            contentPadding = PaddingValues(0.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
        ) {Image(painter = painterResource(R.drawable.back),
            contentDescription = "",
            modifier = Modifier.fillMaxSize()) }



        Text("Signup",
            fontSize = 17.sp,
            fontFamily = interFontFamily,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(top = 25.dp),
            color = Color.White
        )
        Text("", modifier = Modifier.padding(end = 10.dp))

    }
    Column(modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(Modifier.height(140.dp))
        Text("Choose a Password",
            fontSize = 22.sp,
            fontFamily = interFontFamily,
            fontWeight = FontWeight.Medium)
        Spacer(Modifier.height(40.dp))

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
        var isPasswordVisible = false
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

        Spacer(Modifier.height(30.dp))



        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp)){
            Text(
                "Confirm Password",
                fontSize = 15.sp,
                fontFamily = interFontFamily,
                color = Color(0xFF363B44),
                textAlign = TextAlign.Start)
        }
        TextField(value = confirmpassword,
            onValueChange = {confirmpassword},
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
        Spacer(Modifier.height(25.dp))



            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp), verticalAlignment = Alignment.CenterVertically) {
                Image(painter = painterResource(R.drawable.square),
                    contentDescription = "")
                Spacer(Modifier.width(3.dp))
                Text("I have made myself acquainted with",
                    fontSize = 17.sp,
                    fontFamily = interFontFamily,
                    color = Color(0xFF6E8AFC)
                )

        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp)) {Text("the Rules ",
            fontSize = 17.sp,
            fontFamily = interFontFamily,
            color = Color(0xFF6E8AFC)
        )
            Text("and accept all its provisions,",
                fontSize = 17.sp,
                fontFamily = interFontFamily,
                color = Color.Gray)
        }


    }
    Column(modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(Modifier.height(580.dp))

        Button(onClick = {navController.navigate("main")},
            modifier = Modifier
                .padding(horizontal = 20.dp)
                .fillMaxWidth()
                .height(56.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF5B7AFC))) {
            Text("Signup",
                fontSize = 20.sp,
                fontFamily = interFontFamily
            )}





        Row(modifier = Modifier.padding(top = 25.dp)) {
            Text("Already you member? ",
                fontFamily = interFontFamily,
                fontSize = 16.sp,
                color = Color.Gray,
                fontWeight = FontWeight.Medium)

            Text("Login",
                fontFamily = interFontFamily,
                fontSize = 16.sp,
                color = Color(0xFF5B7AFC),
                fontWeight = FontWeight.Medium,
                modifier = Modifier
                    .clickable {
                        navController.navigate("login")
                    }
                    .padding(start = 3.dp))
        }
    }




}

@Preview
@Composable
private fun PasswordPrev() {
    SignUpPassword()

}