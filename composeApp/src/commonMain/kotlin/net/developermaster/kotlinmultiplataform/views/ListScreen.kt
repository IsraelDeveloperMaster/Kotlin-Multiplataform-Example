package net.developermaster.kotlinmultiplataform.views

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import net.developermaster.kotlinmultiplataform.model.Movie
import net.developermaster.kotlinmultiplataform.model.movies

@Composable
fun ListScreen(navcontroller: NavController) {

    Scaffold(Modifier.fillMaxSize(),

        topBar = {

            TopBarListScreen(navcontroller)
        }

    ) { paddingValues ->

        BodyListScreen(paddingValues)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarListScreen(navcontroller: NavController) {

//    Spacer(modifier = Modifier.height(200.dp))


    TopAppBar(colors = androidx.compose.material3.TopAppBarDefaults.largeTopAppBarColors(),
        modifier = Modifier.padding(10.dp),
        title = {
            Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = "back",
                modifier = Modifier.clickable {
                    navcontroller.popBackStack()
                })

            Text(
                modifier = Modifier.padding(start = 30.dp), text = "List Screen"

            )
        },
        actions = {
//            Text(text = "Ações")
            Icon(
                imageVector = Icons.Default.Menu, contentDescription = "Menu"
            )
        })
}

@Composable
fun BodyListScreen(paddingValues: PaddingValues) {

    var texto by remember { mutableStateOf("") }

    LazyVerticalGrid(
        modifier = Modifier.padding(paddingValues),
        contentPadding = PaddingValues(16.dp),
        columns = GridCells.Adaptive(120.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {

        items(movies, key = { it.id }) {
            MovieItem(movie = it)
        }

    }
}

@Composable
fun MovieItem(movie: Movie) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Box(
            modifier = Modifier.fillMaxSize().aspectRatio(2 / 3f)
                .clip(androidx.compose.material3.Shapes().small)
                .background(MaterialTheme.colorScheme.primaryContainer)
        )
        Text(
            text = movie.title,
            modifier = Modifier.padding(16.dp),
            style = MaterialTheme.typography.bodySmall,
            maxLines = 1// para quebrar a linha uma vez que o texto ultrapassa o limite
        )
    }
}




