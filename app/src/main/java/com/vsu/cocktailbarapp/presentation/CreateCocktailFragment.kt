package com.vsu.cocktailbarapp.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vsu.cocktailbarapp.R
import com.vsu.cocktailbarapp.databinding.FragmentCreateCocktailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CreateCocktailFragment : Fragment() {
    private lateinit var binding: FragmentCreateCocktailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCreateCocktailBinding.inflate(inflater, container, false)
        return binding.root
    }
}