package com.labo5_moviles.ui.movie.billboard.recyclerview

import androidx.recyclerview.widget.RecyclerView
import com.labo5_moviles.data.model.MovieModel
import com.labo5_moviles.databinding.MovieItemBinding

class MovieRecyclerViewHolder(private val binding: MovieItemBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(movie: MovieModel, clickListener: (MovieModel) -> Unit) {
        binding.titleTextView.text = movie.name
        binding.qualificationTextView.text = movie.qualification

        binding.movieItemCardView.setOnClickListener{
            clickListener(movie)
        }
    }
}