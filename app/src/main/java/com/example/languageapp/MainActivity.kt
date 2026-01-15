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
import com.example.languageapp.ui.theme.Navigation
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
import com.example.languageapp.ui.theme.screens.WordPractice

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LanguageappTheme {

                Listening3()
            }
        }
    }
}

