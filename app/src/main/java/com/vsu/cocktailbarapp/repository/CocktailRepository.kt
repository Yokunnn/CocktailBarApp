package com.vsu.cocktailbarapp.repository

import com.vsu.cocktailbarapp.db.Cocktail
import com.vsu.cocktailbarapp.db.CocktailDao
import javax.inject.Inject

class CocktailRepository @Inject constructor(
    private val cocktailDao: CocktailDao
) {
    suspend fun getAll() = cocktailDao.getAll()
    suspend fun findById(cocktailId: Int) = cocktailDao.findById(cocktailId)
    suspend fun insertAll(vararg cocktail: Cocktail) = cocktailDao.insertAll(*cocktail)
    suspend fun delete(cocktail: Cocktail) = cocktailDao.delete(cocktail)
}