package com.vsu.cocktailbarapp.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface CocktailDao {
    @Query("SELECT * FROM cocktail")
    fun getAll(): List<Cocktail>

    @Query("SELECT * FROM cocktail WHERE id = (:cocktailId)")
    fun findById(cocktailId: Int): Cocktail

    @Insert
    fun insertAll(vararg cocktails: Cocktail)

    @Delete
    fun delete(cocktail: Cocktail)
}