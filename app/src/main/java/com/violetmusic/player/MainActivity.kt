
package com.violetmusic.player

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val VioletBackground = Color(0xFF09070D)
private val VioletAccent = Color(0xFFB45CFF)

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                VioletMusicApp()
            }
        }
    }
}

@Composable
private fun VioletMusicApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = VioletBackground
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(VioletBackground)
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "VIOLET",
                color = VioletAccent,
                fontSize = 38.sp,
                fontWeight = FontWeight.ExtraBold,
                letterSpacing = 6.sp
            )

            Text(
                text = "MUSIC",
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
                letterSpacing = 8.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Tu música. Tu espacio.",
                color = Color.LightGray,
                fontSize = 15.sp
            )

            Spacer(modifier = Modifier.height(32.dp))

            Text(
                text = "Preparando tu experiencia musical",
                color = VioletAccent,
                fontSize = 13.sp
            )
        }
    }
}
