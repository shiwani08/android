package com.example.article

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.R
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.article.ui.theme.ArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText("JetPack Compose Tutorial",
                        "Jetpack Compose is a modern toolkit for building native Android UI. \\" +
                                "Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
                        "In this tutorial, you build a simple UI component with declarative functions. \\" +
                                "You call Compose functions to say what elements you want and the Compose compiler does the rest. \\" +
                                "Compose is built around Composable functions. \\" +
                                "These functions let you define your app's UI programmatically because they let you describe \\" +
                                "how it should look and provide data dependencies, rather than focus on the process of the UI's construction, \\" +
                                "such as initializing an element and then attaching it to a parent. \\" +
                                "To create a Composable function, you add the @Composable annotation to the function name.")
                }

            }
        }
    }
}

@Composable
fun GreetingText(m2: String, m3: String, m4: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .padding(0.dp)
    ) {
        Text(
            text = m2,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    top = 16.dp,
                    end = 16.dp,
                    bottom = 16.dp)
        )
        Text(
            text = m3,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    end = 16.dp)
                .align(alignment = Alignment.End)
        )
        Text(
            text = m4,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    top = 16.dp,
                    end = 16.dp,
                    bottom = 16.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Composable
fun GreetingImage(m2: String, m3: String, m4: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column(modifier = modifier) {
        Image(
            painter = image,
            contentDescription = null,
            //contentScale = ContentScale.Crop
        )
        GreetingText(m2 = m2, m3 = m3, m4 = m4)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArticleTheme {
        GreetingImage("JetPack Compose Tutorial",
            "Jetpack Compose is a modern toolkit for building native Android UI. \\" +
                    "Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
            "In this tutorial, you build a simple UI component with declarative functions. \\" +
                    "You call Compose functions to say what elements you want and the Compose compiler does the rest. \\" +
                    "Compose is built around Composable functions. \\" +
                    "These functions let you define your app's UI programmatically because they let you describe \\" +
                    "how it should look and provide data dependencies, rather than focus on the process of the UI's construction, \\" +
                    "such as initializing an element and then attaching it to a parent. \\" +
                    "To create a Composable function, you add the @Composable annotation to the function name.")
    }
}
