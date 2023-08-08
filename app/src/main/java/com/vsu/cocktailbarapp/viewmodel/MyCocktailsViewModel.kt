package com.vsu.cocktailbarapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vsu.cocktailbarapp.db.Cocktail
import com.vsu.cocktailbarapp.repository.CocktailRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MyCocktailsViewModel @Inject constructor(
    private val repository: CocktailRepository
) : ViewModel() {

    var cocktailsResult = MutableLiveData<List<Cocktail>>()

    fun getAll(){
        viewModelScope.launch {
            cocktailsResult.postValue(repository.getAll())
        }
    }
}