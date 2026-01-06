package com.example.languageapp.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.languageapp.ui.theme.screens.LogIn
import com.example.languageapp.ui.theme.screens.Nointernet
import com.example.languageapp.ui.theme.screens.OnBoard1
import com.example.languageapp.ui.theme.screens.OnBoard2
import com.example.languageapp.ui.theme.screens.OnBoard3
import com.example.languageapp.ui.theme.screens.SignUp
import com.example.languageapp.ui.theme.screens.SignUpPassword
import com.example.languageapp.ui.theme.screens.SplashScreen


@Composable
fun Navigation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()



    NavHost(navController = navController, startDestination = "noiternet") {
        composable("noiternet") { Nointernet(navController = navController) }
        composable("splash") { SplashScreen(navController = navController) }
        composable("onboard1") { OnBoard1(navController = navController) }
        composable("onboard2") { OnBoard2(navController = navController) }
        composable("onboard3") { OnBoard3(navController = navController) }
        composable("signup") { SignUp(navController = navController) }
        composable("signuppassword") { SignUpPassword(navController = navController) }
        composable("login") { LogIn(navController = navController) }


    }
}
