package net.developermaster.kotlinmultiplataform

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.navigation.compose.rememberNavController
import net.developermaster.kotlinmultiplataform.views.App

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KotlinMultiplataform",
    ) {
        App()
    }
}