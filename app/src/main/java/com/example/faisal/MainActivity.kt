package com.example.faisal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
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
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.faisal.ui.theme.FaisalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FaisalTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    userprofile()
                }
            }
        }
    }
}

@Composable
fun userprofile() {
    Box (modifier = Modifier.background(Color.Black)){
        Row(modifier = Modifier.fillMaxWidth()){
            Image(
                painter = painterResource(id = R.drawable.batu),
                contentDescription = "batu",
                modifier = Modifier.size(60.dp).offset(y = 15.dp,x = 20.dp)
            )
            Column(modifier = Modifier
                .padding(20.dp)
                .background(Color.Transparent)) {
                Text(
                    text = "Faisal Yulianto",
                    fontSize = 20.sp,
                    color = Color.White
                )
                Text(
                    text = "312210646",
                    fontSize = 20.sp,
                    color = Color.White
                )
            }

            }


    }
}


@Preview(showBackground = true)
@Composable
fun userProfilePreview() {
    FaisalTheme {
        userprofile()
    }
}

