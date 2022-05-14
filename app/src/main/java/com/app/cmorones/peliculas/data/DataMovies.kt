package com.app.cmorones.peliculas.data

import android.content.Context
import com.app.cmorones.peliculas.model.Movie

class DataMovies(context: Context?) {
    val context = context

    fun getMovies(): ArrayList<Movie>
    {
        val tmpArrayList = ArrayList<Movie>()

        val movie1 = Movie(
            1,
            "Sonic the Hedgehog 2",
            "The world’s favorite blue hedgehog is back for a next-level adventure in SONIC THE HEDGEHOG 2.",
            "Family",
            "Apr 8, 2022"
        )
        tmpArrayList.add(movie1)

        val movie2 = Movie(
            2,
            "All The Old Knives",
            "When the CIA discovers one of its agents leaked information more than 100 people died.",
            "Remake",
            "Apr 8, 2022"
        )
        tmpArrayList.add(movie2)

        val movie3 = Movie(
            3,
            "As They Made Us",
            "As They Made Us follows Abigail (Agron), a divorced mother of two...",
            "Romance",
            "Apr 7, 2022"
        )
        tmpArrayList.add(movie3)

        val movie4 = Movie(
            4,
            "Agent Game",
            "A CIA officer finds himself the target of a rendition operation after being scapegoated for...",
            "Thriller",
            "Apr 6, 2022"
        )
        tmpArrayList.add(movie4)

        val movie5 = Movie(
            5,
            "Coast",
            "Desperate to escape the trappings of her small coastal farming town, 16-year-old Abby falls...",
            "Drama",
            "Apr 5, 2022"
        )
        tmpArrayList.add(movie5)

        val movie6 = Movie(
            6,
            "¡Viva Maestro!",
            "Conductor Gustavo Dudamel sets the music world afire with his original interpretations of the...",
            "Documentary",
            "Apr 4, 2022"
        )
        tmpArrayList.add(movie6)

        val movie7 = Movie(
            7,
            "The Girl & The Spider",
            "As her roommate Lisa prepares to move out of their apartment, Mara contemplates the end of an era...",
            "Drama",
            "Apr 3, 2022"
        )
        tmpArrayList.add(movie7)

        val movie8 = Movie(
            8,
            "Metal Lords",
            "Two kids want to start a heavy metal band in a high school where exactly two kids care about heavy metal...",
            "Comedy",
            "Apr 2, 2022"
        )
        tmpArrayList.add(movie8)

        val movie9 = Movie(
            9,
            "Aline",
            "Two time Cesar Award-winning writer/director/star Lemercier's musical dramedy begins in 1960s Quebec...",
            "Musical",
            "Apr 1, 2022"
        )
        tmpArrayList.add(movie9)

        val movie10 = Movie(
            10,
            "Dancing on Glass",
            "After the star of the Spanish National Dance Company tragically commits suicide, Irene is selected to take her place...",
            "Dance",
            "Apr 1, 2022"
        )
        tmpArrayList.add(movie10)

        return tmpArrayList
    }

    fun getMovie( id: Int ): ArrayList<Movie>
    {
        val allMovies = getMovies()

        val filteredMovie = ArrayList<Movie>()

        allMovies.forEach { movie ->
            if (movie.id == id) {
                filteredMovie.add(movie)
            }
        }
        return filteredMovie
    }
}