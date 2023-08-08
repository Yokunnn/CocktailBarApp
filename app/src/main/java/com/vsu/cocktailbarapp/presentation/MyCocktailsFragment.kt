package com.vsu.cocktailbarapp.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.vsu.cocktailbarapp.R
import com.vsu.cocktailbarapp.databinding.FragmentMyCocktailsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MyCocktailsFragment : Fragment() {
    private lateinit var binding: FragmentMyCocktailsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMyCocktailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initAddBtn()
    }

    private fun initAddBtn(){
        binding.btnAdd.setOnClickListener {
            findNavController().navigate(R.id.action_myCocktailsFragment_to_createCocktailFragment)
        }
    }
}