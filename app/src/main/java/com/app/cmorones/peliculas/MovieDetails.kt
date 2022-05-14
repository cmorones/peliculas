package com.app.cmorones.peliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.app.cmorones.peliculas.data.DataMovies
import com.app.cmorones.peliculas.databinding.ActivityMovieDetailsBinding
import com.app.cmorones.peliculas.model.Movie



class MovieDetails : AppCompatActivity() {

    private lateinit var binding: ActivityMovieDetailsBinding
    var id: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        if(savedInstanceState == null)
        {
            val bundle = intent.extras
            if( bundle != null ){
                id = bundle.getInt("id" , 0)
            }
            else {
                id = savedInstanceState?.getSerializable("id") as Int
            }
        }

        val movie: ArrayList<Movie> = DataMovies(applicationContext).getMovie(id)

        with(binding)
        {
            when(movie[0].id){
                1 -> {
                    ivMovie.setImageResource(R.drawable.uno)
                    ivThumbMovie.setImageResource(R.drawable.uno)
                    val v1 = findViewById<VideoView>(R.id.vvItem)
                    v1.setVideoPath("android.resource://"+packageName+"/"+R.raw.uno)
                    val mc: MediaController = MediaController(this@MovieDetails)
                    mc.setAnchorView(v1)
                    v1.start()
                    v1.setMediaController(mc)
                    }
                2 -> {
                    ivMovie.setImageResource(R.drawable.dos)
                    ivThumbMovie.setImageResource(R.drawable.dos)
                    val v1 = findViewById<VideoView>(R.id.vvItem)
                    v1.setVideoPath("android.resource://"+packageName+"/"+R.raw.dos)
                    val mc: MediaController = MediaController(this@MovieDetails)
                    mc.setAnchorView(v1)
                    v1.start()
                    v1.setMediaController(mc)
                }
                3 -> {
                    ivMovie.setImageResource(R.drawable.tres)
                    ivThumbMovie.setImageResource(R.drawable.tres)
                    val v1 = findViewById<VideoView>(R.id.vvItem)
                    v1.setVideoPath("android.resource://"+packageName+"/"+R.raw.tres)
                    val mc: MediaController = MediaController(this@MovieDetails)
                    mc.setAnchorView(v1)
                    v1.start()
                    v1.setMediaController(mc)

                }
                4 -> {
                    ivMovie.setImageResource(R.drawable.cuatro)
                    ivThumbMovie.setImageResource(R.drawable.cuatro)
                    val v1 = findViewById<VideoView>(R.id.vvItem)
                    v1.setVideoPath("android.resource://"+packageName+"/"+R.raw.cuatro)
                    val mc: MediaController = MediaController(this@MovieDetails)
                    mc.setAnchorView(v1)
                    v1.start()
                    v1.setMediaController(mc)
                }
                5 -> {
                    ivMovie.setImageResource(R.drawable.cinco)
                    ivThumbMovie.setImageResource(R.drawable.cinco)
                }
                6 -> {
                    ivMovie.setImageResource(R.drawable.seis)
                    ivThumbMovie.setImageResource(R.drawable.seis)
                    val v1 = findViewById<VideoView>(R.id.vvItem)
                    v1.setVideoPath("android.resource://"+packageName+"/"+R.raw.seis)
                    val mc: MediaController = MediaController(this@MovieDetails)
                    mc.setAnchorView(v1)
                    v1.start()
                    v1.setMediaController(mc)
                }
                7 -> {
                    ivMovie.setImageResource(R.drawable.siete)
                    ivThumbMovie.setImageResource(R.drawable.siete)
                }
                8 -> {
                    ivMovie.setImageResource(R.drawable.ocho)
                    ivThumbMovie.setImageResource(R.drawable.ocho)
                    val v1 = findViewById<VideoView>(R.id.vvItem)
                    v1.setVideoPath("android.resource://"+packageName+"/"+R.raw.ocho)
                    val mc: MediaController = MediaController(this@MovieDetails)
                    mc.setAnchorView(v1)
                    v1.start()
                    v1.setMediaController(mc)
                }
                9 -> {
                    ivMovie.setImageResource(R.drawable.nueve)
                    ivThumbMovie.setImageResource(R.drawable.nueve)
                }
                10 -> {
                    ivMovie.setImageResource(R.drawable.diez)
                    ivThumbMovie.setImageResource(R.drawable.diez)
                }
            }
            tvTitle.text = movie[0].title
            tvDate.text = movie[0].date
            tvDescription.text = movie[0].description
            tvGenre.text = movie[0].genre
        }
    }
}