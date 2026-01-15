package com.example.languageapp.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.languageapp.ui.theme.screens.Animals
import com.example.languageapp.ui.theme.screens.Eror
import com.example.languageapp.ui.theme.screens.Listening
import com.example.languageapp.ui.theme.screens.Listening2
import com.example.languageapp.ui.theme.screens.Listening3
import com.example.languageapp.ui.theme.screens.LogIn
import com.example.languageapp.ui.theme.screens.MainScreen
import com.example.languageapp.ui.theme.screens.Nointernet
import com.example.languageapp.ui.theme.screens.OnBoard
import com.example.languageapp.ui.theme.screens.Profile
import com.example.languageapp.ui.theme.screens.SelectLanguage

import com.example.languageapp.ui.theme.screens.SignUp
import com.example.languageapp.ui.theme.screens.SignUpPassword
import com.example.languageapp.ui.theme.screens.SplashScreen
import com.example.languageapp.ui.theme.screens.Succes


@Composable
fun Navigation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()



    NavHost(navController = navController, startDestination = "noiternet") {
        composable("noiternet") { Nointernet(navController = navController) }
        composable("splash") { SplashScreen(navController = navController) }

        composable("onboard") { OnBoard(navController = navController) }

        composable("signup") { SignUp(navController = navController) }
        composable("signuppassword") { SignUpPassword(navController = navController) }
        composable("login") { LogIn(navController = navController) }
        composable("animals") { Animals(navController = navController) }

        composable("eroranimal") { Eror(navController = navController) }
        composable("succesanimal") { Succes(navController = navController) }


        composable("listening") { Listening(navController = navController) }
        composable("listening2") { Listening2(navController = navController) }

        composable("listening3") { Listening3(navController = navController) }


        composable("select") { SelectLanguage(navController = navController) }
        composable("profile") { Profile(navController = navController) }
        composable("main") { MainScreen(navController = navController) }



    }
}
