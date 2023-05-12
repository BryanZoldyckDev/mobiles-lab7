package com.labo5_moviles.ui.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.labo5_moviles.R
import com.labo5_moviles.data.movies
import com.labo5_moviles.databinding.FragmentMovieBinding
import com.labo5_moviles.ui.movie.viewmodel.MovieViewModel

class MovieFragment : Fragment() {

    private val movieViewModel: MovieViewModel by activityViewModels {
        MovieViewModel.Factory
    }
    private lateinit var binding : FragmentMovieBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setViewModel()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding  = FragmentMovieBinding.inflate(inflater, container , false)
        return binding.root
    }

    private fun setViewModel(){
        binding.viewmodel = movieViewModel
    }
}