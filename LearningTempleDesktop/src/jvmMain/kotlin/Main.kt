import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
fun App() {
    val text by remember { mutableStateOf("Hello, World!") }
    var isClicked by remember { mutableStateOf(false) }
    val bgColor = when(isClicked) {
        true -> Color.Red
        else -> Color.Black
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Hello!!!!",
            color = bgColor,
            fontSize = 35.sp
        )
        Button(
            onClick = { isClicked = !isClicked },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green)
        ) {
            Text(text, color = Color.White)
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
