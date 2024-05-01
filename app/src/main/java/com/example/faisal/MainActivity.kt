package com.example.faisal

import android.icu.text.ListFormatter.Width
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.faisal.ui.theme.FaisalTheme
import kotlin.contracts.contract

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
    Box (modifier = Modifier
        .background(Color.Black)
        .border(2.dp, Color.White)){
        Row(modifier = Modifier.fillMaxWidth()){
            Image(
                painter = painterResource(id = R.drawable.batu),
                contentDescription = "batu",
                modifier = Modifier
                    .size(70.dp)
                    .offset(y = 10.dp, x = 10.dp)
                    .border(2.dp, Color.Red, CircleShape)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(40.dp))
            Column(modifier = Modifier
                .weight(1f)
                .padding(15.dp)
                .background(Color.Transparent)
                .fillMaxWidth()){
                Text(
                    text = "Faisal Yulianto",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 20.sp,
                    color = Color.White
                )
                Text(
                    text = "312210646",
                    fontSize = 15.sp,
                    color = Color.White
                )
                Button(onClick = { /*TODO*/ },
                    contentPadding = PaddingValues(
                        start = 20.dp, end = 20.dp ),
                        modifier = Modifier.height(25.dp)) {
                    Icon(imageVector = Icons.Default.Call,contentDescription = "call",
                        modifier = Modifier.size(15.dp))
                    Spacer(modifier = Modifier.width(5.dp))
                    Text(text = "Call", fontWeight = FontWeight.Bold)
                }

            }
            Icon(imageVector = Icons.Filled.AccountBox ,
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .width(30.dp)
                    .height(40.dp)
                    .offset(x = -20.dp)
            )
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

