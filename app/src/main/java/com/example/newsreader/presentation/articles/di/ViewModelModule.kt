package com.example.newsreader.presentation.articles.di

import com.example.newsreader.data.NewsRepository
import com.example.newsreader.presentation.articles.NewsViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object ViewModelModule {
    @Provides
    fun provideNewsViewModel(newsRepository: NewsRepository): NewsViewModel {
        return NewsViewModel(newsRepository)
    }
}