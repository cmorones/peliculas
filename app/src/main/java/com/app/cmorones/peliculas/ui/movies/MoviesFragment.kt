package com.app.cmorones.peliculas.ui.movies

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.cmorones.peliculas.MovieDetails
import com.app.cmorones.peliculas.adapter.MovieAdapter
import com.app.cmorones.peliculas.data.DataMovies
import com.app.cmorones.peliculas.databinding.FragmentMoviesBinding
import com.app.cmorones.peliculas.model.Movie

class MoviesFragment : Fragment() , MovieAdapter.OnItemListener {

    private lateinit var binding: FragmentMoviesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMoviesBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Get the data
        val data = DataMovies(requireContext()).getMovies()
        val adapterMovies = MovieAdapter(requireContext(), data,this)
        with(binding){
            val lm = LinearLayoutManager(requireContext())
            rvMovies.addItemDecoration(DividerItemDecoration(requireContext(),lm.orientation))
            rvMovies.layoutManager = lm
            rvMovies.adapter = adapterMovies
        }

    }

    override fun clickMovie(movie: Movie) {
        Toast.makeText(requireContext(), "Movie: ${movie.title}", Toast.LENGTH_SHORT).show()
        val intent = Intent(activity,MovieDetails::class.java)
        intent.putExtra("id" , movie.id)
        startActivity(intent)
    }
}