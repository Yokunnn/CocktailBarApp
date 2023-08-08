package com.vsu.cocktailbarapp.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.vsu.cocktailbarapp.R
import com.vsu.cocktailbarapp.databinding.FragmentMyCocktailsBinding
import com.vsu.cocktailbarapp.viewmodel.MyCocktailsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MyCocktailsFragment : Fragment() {
    private lateinit var binding: FragmentMyCocktailsBinding
    private val viewModel: MyCocktailsViewModel by viewModels()
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

        viewModel.getAll()
        observeCocktailResult()
    }

    private fun initAddBtn() {
        binding.btnAdd.setOnClickListener {
            findNavController().navigate(R.id.action_myCocktailsFragment_to_createCocktailFragment)
        }
    }

    private fun observeCocktailResult() {
        viewModel.cocktailsResult.observe(viewLifecycleOwner) { list ->
            if (list.isNotEmpty()) {
                binding.summerHolidays.visibility = View.GONE
                binding.addCocktailTv.visibility = View.GONE
                binding.arrowDownIv.visibility = View.GONE
                //запихнуть из листа коктейли в адаптер для recycleview
            }
        }
    }
}