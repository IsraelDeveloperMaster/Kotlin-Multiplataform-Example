package net.developermaster.kotlinmultiplataform.model


sealed class ModelScreen(val route: String) {

    data object LoginScreenObject : ModelScreen("loginScreen")
    data object MainScreenObject : ModelScreen("mainScreen")
    data object InformationScreenObject : ModelScreen("informationScreen")
}