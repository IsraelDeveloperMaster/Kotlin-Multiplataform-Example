package net.developermaster.kotlinmultiplataform.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import net.developermaster.kotlinmultiplataform.model.ModelScreen
import net.developermaster.kotlinmultiplataform.views.InformationScreen
import net.developermaster.kotlinmultiplataform.views.ListScreen
import net.developermaster.kotlinmultiplataform.views.LoginScreen
import net.developermaster.kotlinmultiplataform.views.MainScreen

@Composable
fun NavigationNavController() {

    //hook que retorna um navController
    val navController = rememberNavController()

    //controlador de navegação que recebe o navController para a rota inicial
    NavHost(navController = navController, startDestination = ModelScreen.ListScreenObject.route) {

        //rota de loginScreen
        composable(ModelScreen.LoginScreenObject.route) {
            LoginScreen(navController)
        }

        //rota mainScreen
        composable(ModelScreen.MainScreenObject.route) {
            MainScreen(navController)
        }

        //rota de informationScreen
        composable(ModelScreen.InformationScreenObject.route + "/{nome}" ,

            arguments = listOf(navArgument("nome") {
            type = NavType.StringType

        })) {
            InformationScreen(navController, it.arguments?.getString("nome") ?: "Não informado")
        }

        composable(ModelScreen.ListScreenObject.route) {
            ListScreen(navController)
        }

    }

}


/*
        composable (ModelScreen.MainScreenObject.route)  {

            MainScreen { navController.navigate(ModelDetalhes(nome = it).toString())}

        }   */

//rota de informação
//
//    }


//composable <ModelScreen.MainScreenObject> {
