package com.example.newsreader.data

import retrofit2.Response
import retrofit2.http.GET

interface NewsApiService {
    @GET("everything?q=tesla&from=2023-05-19&sortBy=publishedAt&apiKey=e50d529336a540e18862f9ab2e7ea611")
    suspend fun getNewsArticles(): Response<NewsResponse>
}