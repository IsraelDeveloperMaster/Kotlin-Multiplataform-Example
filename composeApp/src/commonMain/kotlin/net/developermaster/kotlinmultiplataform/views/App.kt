package net.developermaster.kotlinmultiplataform.views


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun App(navController: NavController) {

    MaterialTheme {
        Scaffold {
            padding ->
            TopBarAppScreen(navController)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarAppScreen(navController: NavController) {

    Spacer(modifier = Modifier.height(100.dp))

    TopAppBar( modifier = Modifier.padding(10.dp),

        title = {

            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = "back",
                modifier = Modifier.clickable {

//                    navController.popBackStack()
                }
            )

            Text(modifier = Modifier.padding(start = 30.dp),
                text = "Main Screen")
        },

        actions = {
//            Text(text = "Ações")
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "Menu"
            )
        }
    )
}
