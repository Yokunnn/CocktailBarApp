package com.vsu.cocktailbarapp.db

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Cocktail::class], version = 1)
abstract class AppDataBase : RoomDatabase(){
    abstract fun cocktailDao(): CocktailDao
}