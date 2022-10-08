package com.example.movieapp.screen.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.rememberImagePainter
import com.example.movieapp.model.getMovies
import com.example.movieapp.widgets.MovieRow

@Composable
fun DetailScreen(navController: NavHostController, movieId: String?) {
    val movie = getMovies().filter { it.id == movieId }.first()
    Scaffold(topBar = {
        TopAppBar(
            backgroundColor = Color.Transparent,
            elevation = 0.dp
        ) {
            Row(horizontalArrangement = Arrangement.Start) {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Arrow back",
                    modifier = Modifier.clickable {
                        navController.popBackStack()
                    })
                Spacer(modifier = Modifier.width(100.dp))
                Text(text = movie.title)
            }
        }
    }) {
        Surface(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {
                MovieRow(movie = movie)
                Spacer(modifier = Modifier.height(8.dp))
                Divider()
                Text(text = "Movie Images")
                LazyRow {
                    items(movie.images) {
                        Card(
                            modifier = Modifier
                                .padding(12.dp)
                                .size(240.dp),
                            elevation = 5.dp
                        ) {
                            Image(
                                painter = rememberImagePainter(data = it),
                                contentDescription = "Movie Poster"
                            )
                        }
                    }
                }
            }
        }
    }

}