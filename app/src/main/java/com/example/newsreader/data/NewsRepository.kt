package com.example.newsreader.data

import java.io.IOException
import javax.inject.Inject

class NewsRepository @Inject constructor(private val newsApiService: NewsApiService) {
    suspend fun getNewsArticles(): List<NewsArticle> {
        val response = newsApiService.getNewsArticles()
        if (response.isSuccessful) {
            return response.body()?.articles ?: emptyList()
        } else {
            throw IOException("Error fetching news articles")
        }
    }
}