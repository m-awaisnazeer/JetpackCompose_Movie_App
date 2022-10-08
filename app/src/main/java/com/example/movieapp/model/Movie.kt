package com.example.movieapp.model

data class Movie(
    val id: String,
    val title: String,
    val year: String,
    val genre: String,
    val director: String,
    val actors: String,
    val plot: String,
    val poster: String,
    val images: List<String>,
    val rating: String
)

fun getMovies(): List<Movie> {
    return listOf(
        Movie(
            "1",
            "Avatar 0",
            "2009",
            "Action",
            "James Cameron",
            "ABC, XYZ",
            "A Unique Planet",
            "https://upload.wikimedia.org/wikipedia/en/d/d6/Avatar_%282009_film%29_poster.jpg?20160108155120",
            listOf(
                "https://m.media-amazon.com/images/M/MV5BMWFmYmRiYzMtMTQ4YS00NjA5LTliYTgtMmM3OTc4OGY3MTFkXkEyXkFqcGdeQXVyODk4OTc3MTY@._V1_.jpg",
                "https://cdn.mos.cms.futurecdn.net/FvLi2evhiuCYNdZ7HALQu3.jpeg",
                "https://m.media-amazon.com/images/M/MV5BMTY2ODQ3NjMyMl5BMl5BanBnXkFtZTcwODg0MTUzNA@@._V1_.jpg"
            ),
            "7.9"
        ),
        Movie(
            "2",
            "Avatar 1",
            "2009",
            "Action",
            "James Cameron",
            "ABC, XYZ",
            "A Unique Planet",
            "https://upload.wikimedia.org/wikipedia/en/d/d6/Avatar_%282009_film%29_poster.jpg?20160108155120",
            listOf(
                "https://m.media-amazon.com/images/M/MV5BMWFmYmRiYzMtMTQ4YS00NjA5LTliYTgtMmM3OTc4OGY3MTFkXkEyXkFqcGdeQXVyODk4OTc3MTY@._V1_.jpg",
                "https://cdn.mos.cms.futurecdn.net/FvLi2evhiuCYNdZ7HALQu3.jpeg",
                "https://m.media-amazon.com/images/M/MV5BMTY2ODQ3NjMyMl5BMl5BanBnXkFtZTcwODg0MTUzNA@@._V1_.jpg"
            ),
            "7.9"
        ),
        Movie(
            "3",
            "Avatar 2",
            "2009",
            "Action",
            "James Cameron",
            "ABC, XYZ",
            "A Unique Planet",
            "https://upload.wikimedia.org/wikipedia/en/d/d6/Avatar_%282009_film%29_poster.jpg?20160108155120",
            listOf(
                "https://m.media-amazon.com/images/M/MV5BMWFmYmRiYzMtMTQ4YS00NjA5LTliYTgtMmM3OTc4OGY3MTFkXkEyXkFqcGdeQXVyODk4OTc3MTY@._V1_.jpg",
                "https://cdn.mos.cms.futurecdn.net/FvLi2evhiuCYNdZ7HALQu3.jpeg",
                "https://m.media-amazon.com/images/M/MV5BMTY2ODQ3NjMyMl5BMl5BanBnXkFtZTcwODg0MTUzNA@@._V1_.jpg"
            ),
            "7.9"
        ),
        Movie(
            "4",
            "Avatar 3",
            "2009",
            "Action",
            "James Cameron",
            "ABC, XYZ",
            "A Unique Planet",
            "https://upload.wikimedia.org/wikipedia/en/d/d6/Avatar_%282009_film%29_poster.jpg?20160108155120",
            listOf(
                "https://m.media-amazon.com/images/M/MV5BMWFmYmRiYzMtMTQ4YS00NjA5LTliYTgtMmM3OTc4OGY3MTFkXkEyXkFqcGdeQXVyODk4OTc3MTY@._V1_.jpg",
                "https://cdn.mos.cms.futurecdn.net/FvLi2evhiuCYNdZ7HALQu3.jpeg",
                "https://m.media-amazon.com/images/M/MV5BMTY2ODQ3NjMyMl5BMl5BanBnXkFtZTcwODg0MTUzNA@@._V1_.jpg"
            ),
            "7.9"
        ),
        Movie(
            "5",
            "Avatar 4",
            "2009",
            "Action",
            "James Cameron",
            "ABC, XYZ",
            "A Unique Planet",
            "https://upload.wikimedia.org/wikipedia/en/d/d6/Avatar_%282009_film%29_poster.jpg?20160108155120",
            listOf(
                "https://m.media-amazon.com/images/M/MV5BMWFmYmRiYzMtMTQ4YS00NjA5LTliYTgtMmM3OTc4OGY3MTFkXkEyXkFqcGdeQXVyODk4OTc3MTY@._V1_.jpg",
                "https://cdn.mos.cms.futurecdn.net/FvLi2evhiuCYNdZ7HALQu3.jpeg",
                "https://m.media-amazon.com/images/M/MV5BMTY2ODQ3NjMyMl5BMl5BanBnXkFtZTcwODg0MTUzNA@@._V1_.jpg"
            ),
            "7.9"
        ),
        Movie(
            "6",
            "Avatar 5",
            "2009",
            "Action",
            "James Cameron",
            "ABC, XYZ",
            "A Unique Planet",
            "https://upload.wikimedia.org/wikipedia/en/d/d6/Avatar_%282009_film%29_poster.jpg?20160108155120",
            listOf(
                "https://m.media-amazon.com/images/M/MV5BMWFmYmRiYzMtMTQ4YS00NjA5LTliYTgtMmM3OTc4OGY3MTFkXkEyXkFqcGdeQXVyODk4OTc3MTY@._V1_.jpg",
                "https://cdn.mos.cms.futurecdn.net/FvLi2evhiuCYNdZ7HALQu3.jpeg",
                "https://m.media-amazon.com/images/M/MV5BMTY2ODQ3NjMyMl5BMl5BanBnXkFtZTcwODg0MTUzNA@@._V1_.jpg"
            ),
            "7.9"
        )
    )
}