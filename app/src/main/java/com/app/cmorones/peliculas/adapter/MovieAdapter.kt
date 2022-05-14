package com.app.cmorones.peliculas.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.cmorones.peliculas.R
import com.app.cmorones.peliculas.databinding.MovieElementBinding
import com.app.cmorones.peliculas.model.Movie



class MovieAdapter(private val context: Context, val movie: ArrayList<Movie> , val onItemListener: OnItemListener) : RecyclerView.Adapter<MovieAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = MovieElementBinding.inflate(layoutInflater)
        return ViewHolder(binding,onItemListener)
    }

    override fun onBindViewHolder(holder: MovieAdapter.ViewHolder, position: Int) {
        holder.bindData(movie[position])
    }

    override fun getItemCount(): Int {
        return movie.size
    }

    interface OnItemListener {
        fun clickMovie(movie: Movie)
    }

    class ViewHolder(binding: MovieElementBinding, onItemListener: OnItemListener) : RecyclerView.ViewHolder(binding.root), View.OnClickListener {
        private val binding = binding
        private val onItemListener = onItemListener
        private lateinit var movie: Movie

        init {
            binding.root.setOnClickListener(this)
        }

        override fun onClick(p0: View){
            onItemListener.clickMovie(movie)
        }

        fun bindData(item: Movie){
            with(binding)
            {
                when(item.id) {
                    1 -> ivItem.setImageResource(R.drawable.uno)
                    2 -> ivItem.setImageResource(R.drawable.dos)
                    3 -> ivItem.setImageResource(R.drawable.tres)
                    4 -> ivItem.setImageResource(R.drawable.cuatro)
                    5 -> ivItem.setImageResource(R.drawable.cinco)
                    6 -> ivItem.setImageResource(R.drawable.seis)
                    7 -> ivItem.setImageResource(R.drawable.siete)
                    8 -> ivItem.setImageResource(R.drawable.ocho)
                    9 -> ivItem.setImageResource(R.drawable.nueve)
                    10 -> ivItem.setImageResource(R.drawable.diez)
                }

                tvItemTitle.text = item.title
                tvItemDescription.text = item.description
                tvItemDate.text = item.date
            }

            movie = item
        }

    }
}