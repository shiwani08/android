package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.res.ResourcesCompat
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    IntroScreen()
                }
            }
        }
    }
}

@Composable
fun IntroScreen(modifier: Modifier = Modifier) {
    Surface(modifier = Modifier.fillMaxSize(), color = Color(0xFFF9fbe7)) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val image = painterResource(R.drawable.android_logo)
            Image(painter = image,
                contentDescription = null,
                modifier = Modifier
                    .width(150.dp)
                    .height(150.dp)
                    .background(color = Color.DarkGray),
                )
            Text(
                text = stringResource(R.string.name),
                modifier = Modifier.padding(bottom = 5.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                fontFamily = FontFamily.SansSerif,
                color = Color(0xFF3ddc84)
            )
            Text(
                text = stringResource(R.string.title),
                fontSize = 20.sp
            )
        }
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(bottom = 50.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center) {
                val image = painterResource(R.drawable.phone_icon)
                Image(painter = image,
                    contentDescription = null,
                    modifier = Modifier
                        .width(22.dp)
                        .height(22.dp))
                Text(
                    text = stringResource(R.string.phone),
                    textAlign = TextAlign.Left,
                    modifier = Modifier.padding(start = 9.dp)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center) {
                val image = painterResource(R.drawable.github_icon)
                Image(painter = image,
                    contentDescription = null,
                    modifier = Modifier
                        .width(20.dp)
                        .height(20.dp))
                Text(
                    text = stringResource(R.string.github),
                    textAlign = TextAlign.Left,
                    modifier = Modifier.padding(start = 9.dp)
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center) {
                val image = painterResource(R.drawable.email_icon)
                Image(painter = image,
                    contentDescription = null,
                    modifier = Modifier
                        .width(22.dp)
                        .height(22.dp)
                        .padding(start = 0.dp))
                Text(
                    text = stringResource(R.string.email),
                    textAlign = TextAlign.Left,
                    modifier = Modifier.padding(start = 5.dp))
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun IntroScreenPreview() {
    BusinessCardTheme {
        IntroScreen()
    }
}
