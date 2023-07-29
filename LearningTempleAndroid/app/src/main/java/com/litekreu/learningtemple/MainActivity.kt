package com.litekreu.learningtemple

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.litekreu.learningtemple.ui.theme.LearningTempleTheme
import com.litekreu.learningtemple.ui.theme.kyiv

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearningTempleTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    StartFunc()
                }
            }
        }
    }
}

@Composable
fun StartFunc(modifier: Modifier = Modifier) {
    val logoImg = painterResource(R.drawable.learning_temple_logo)
    Box(
        contentAlignment = Alignment.TopCenter,
        modifier = modifier.padding(top = 16.dp)
    ) {
        Text(
            text = "LiteKreU",
            fontFamily = kyiv,
            fontSize = 36.sp,
            fontWeight = FontWeight.ExtraBold
        )
    }
    Image (
        painter = logoImg,
        contentDescription = null,
        modifier = modifier.padding(20.dp)
    )
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom,
        modifier = modifier.padding(20.dp)
    ) {
        Text(
            text = "Unfinished concept.",
            fontSize = 36.sp,
            fontWeight = FontWeight.Light,
            color = colorResource(R.color.wip)
        )
        Text(
            text = "Work in progress",
            fontSize = 28.sp,
            fontWeight = FontWeight.ExtraLight,
            color = colorResource(R.color.wip)
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    LearningTempleTheme {
        StartFunc()
    }
}