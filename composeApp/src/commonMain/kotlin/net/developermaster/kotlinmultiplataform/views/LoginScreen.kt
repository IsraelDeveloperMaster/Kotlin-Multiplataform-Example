package net.developermaster.kotlinmultiplataform.views

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import net.developermaster.kotlinmultiplataform.model.ModelScreen

@Composable
fun LoginScreen(navcontroller: NavController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Spacer(modifier = Modifier.height(100.dp))

        Text(
            text = "Login Screen",
            color = Color.Red,
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif,
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {

//            navcontroller.navigate(ModelScreen.MainScreenObject.route)
            navcontroller.navigate(ModelScreen.ListScreenObject.route)

        }) {

            Text(text = "Main Screen")

        }
    }
}