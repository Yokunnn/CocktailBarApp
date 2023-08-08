package com.vsu.cocktailbarapp

import android.content.Context
import androidx.room.Room
import com.vsu.cocktailbarapp.db.AppDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideDatabase(context: Context) = Room.databaseBuilder(
        context,
        AppDataBase::class.java,
        "cocktail"
    ).build()

    @Singleton
    @Provides
    fun provideCocktailDao(db: AppDataBase) = db.cocktailDao()
}