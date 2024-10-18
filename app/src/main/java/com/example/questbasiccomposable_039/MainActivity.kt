package com.example.questbasiccomposable_039

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questbasiccomposable_039.ui.theme.QuestBasicComposable_039Theme
import kotlin.math.round

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestBasicComposable_039Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Login(
                        puput = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Login(puput: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.Center, //menyusun konten supaya beraa ditengah
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(text = "Login", //memberikan text "Login"
            modifier = puput,
            fontSize = 70.sp, //menetapkan ukuran font
            fontWeight = FontWeight.Bold //menebalkan text
        )
        Text(text = "Halaman Login", //memberikan text
            style = TextStyle(
                fontSize = 30.sp,
                fontFamily = FontFamily.Serif, //menggunakan font serif
                color =    Color.Blue, //Memberikan warna
        )
        )
        Image(painter = painterResource
            (id = R.drawable.umy), //menambahkan foto
            contentDescription = null,
            Modifier.size(200.dp) //menetapkan size foto
        )
        Text(text = "Nama", //memberikan text "Nama"
            modifier = puput,
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold
        )
        Text(text = "Windya Nurmaretha", //memberikan text
            modifier = puput,
            style = TextStyle(
                fontSize = 30.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Medium,
                color =    Color.Red
            )
        )
        Text(text = "20220140039",
            style = TextStyle(
                fontSize = 30.sp,
                fontStyle = FontStyle.Italic,
                color =    Color.Blue
            )
        )
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    QuestBasicComposable_039Theme {
//        Greeting("Android")
//    }
//}