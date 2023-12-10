package se.novembercode.introcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import se.novembercode.introcompose.ui.theme.IntroComposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IntroComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Calculator("")
                }
            }
        }
    }
}

@Composable
fun Calculator(name: String, modifier: Modifier = Modifier) {
    var number by remember {
        mutableStateOf(0)
    }
Column {
    Text(
        text = "Start",
        modifier = modifier


    )
    Text(number.toString())

Column {
Row {
    Button(onClick = {
        number++
    },

    ) {
        Text("+")
    }
    Button(onClick = {
        number--
    }) {
        Text("-")
    }

}
}
    Column {

        Button(onClick = {
            number = 0
        }) {
            Text("Reset")
        }
    }
}

}

@Preview(showBackground = true)
@Composable
fun Preview() {
    IntroComposeTheme {

        Calculator( "")

    }
}