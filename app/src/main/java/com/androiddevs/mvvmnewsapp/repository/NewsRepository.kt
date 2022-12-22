package com.androiddevs.mvvmnewsapp.repository

import androidx.room.Query
import com.androiddevs.mvvmnewsapp.api.RetroFitInstance
import com.androiddevs.mvvmnewsapp.db.ArticleDatabase

class NewsRepository(val db: ArticleDatabase) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
            RetroFitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
            RetroFitInstance.api.searchForNews(searchQuery,pageNumber)

}