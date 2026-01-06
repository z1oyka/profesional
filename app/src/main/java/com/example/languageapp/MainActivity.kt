package com.example.languageapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.languageapp.ui.theme.LanguageappTheme
import com.example.languageapp.ui.theme.screens.LogIn
import com.example.languageapp.ui.theme.screens.Nointernet
import com.example.languageapp.ui.theme.screens.OnBoard1
import com.example.languageapp.ui.theme.screens.OnBoard2
import com.example.languageapp.ui.theme.screens.OnBoard3
import com.example.languageapp.ui.theme.screens.SignUp
import com.example.languageapp.ui.theme.screens.SignUpPassword
import com.example.languageapp.ui.theme.screens.SplashScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LanguageappTheme {

                SignUpPassword()

            }
        }
    }
}

