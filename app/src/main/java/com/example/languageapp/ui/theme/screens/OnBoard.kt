package com.example.languageapp.ui.theme.screens

import android.media.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.languageapp.R
import com.example.languageapp.ui.theme.interFontFamily
import kotlinx.coroutines.launch
import org.w3c.dom.Text

data class PageData(
    val imageRes: Int,
    val loading: Int,
    val title: String,
    val secondtitle: String,
    val buttontext: String
)

@Composable
fun OnBoard(modifier: Modifier = Modifier,
            navController: NavController = rememberNavController()
) {
    val scope = rememberCoroutineScope()
    val pages = listOf(
        PageData(
            imageRes = R.drawable.illustrations1,
            loading = R.drawable.loading1,
            title = "Confidence in your words",
            secondtitle = "With conversation-based learning, \nyou'll be talking from lesson one",
            buttontext = "Next"
        ),
        PageData(
            imageRes = R.drawable.illustrations2,
            loading = R.drawable.loading2,
            title = "Take your time to learn",
            secondtitle = "Develop a habit of learning and \nmake it a part of your daily routine",
            buttontext = "More"
        ),
        PageData(
            imageRes = R.drawable.illustrations3,
            loading = R.drawable.loading3,
            title = "The lessons you need to learn",
            secondtitle = "Using a variety of learning styles to learn \nand retain",
            buttontext = "Choose a language"
    )
    )
    val pagerState = rememberPagerState(pageCount = {
        3
    })

        HorizontalPager(state = pagerState, modifier = Modifier.fillMaxSize()) {

                page ->
            Column(modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally) {
                Spacer(Modifier.height(200.dp))
                androidx.compose.foundation.Image(painter = painterResource(pages[page].imageRes),
                    contentDescription = "",
                    modifier = Modifier.size(240.dp,220.dp))
                Spacer(Modifier.height(120.dp))
                androidx.compose.foundation.Image(painter = painterResource(pages[page].loading),
                    contentDescription = "",
                    modifier = Modifier.size(40.dp,8.dp))
                Text(text = pages[page].title,
                    fontSize = 28.sp,
                    fontFamily = interFontFamily,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(top = 50.dp)
                )
                Text(text = pages[page].secondtitle,
                    fontSize = 18.sp,
                    fontFamily = interFontFamily,
                    color = Color.Gray,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(top = 10.dp))
                Spacer(Modifier.height(30.dp))


                Button(
                    onClick = {
                        scope.launch {
                            if (page < 2) {
                                pagerState.animateScrollToPage(page + 1)
                            } else{}}

                        },
                        modifier =
                            Modifier.padding(horizontal = 20.dp).fillMaxWidth().height(56.dp),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF5B7AFC))) {
                        Text(
                            text = pages[page].buttontext,
                            fontSize = 23.sp,
                            fontFamily = interFontFamily
                        )
                    }
                        Text(
                            "Skip onboarding",
                            fontSize = 15.sp,
                            fontFamily = interFontFamily,
                            fontWeight = FontWeight.Medium,
                            modifier = Modifier.padding(top = 20.dp)
                        )


                    }


            }

    
}

