package net.developermaster.kotlinmultiplataform

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.navigation.compose.rememberNavController

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KotlinMultiplataform",
    ) {
        App(navController = rememberNavController())
    }
}