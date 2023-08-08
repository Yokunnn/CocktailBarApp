package com.vsu.cocktailbarapp.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cocktail")
data class Cocktail(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo("title")
    val title: String,
    @ColumnInfo("description")
    val description: String?,
    @ColumnInfo("ingredients")
    val ingredients: List<String>,
    @ColumnInfo("Recipe")
    val recipe: String?
)