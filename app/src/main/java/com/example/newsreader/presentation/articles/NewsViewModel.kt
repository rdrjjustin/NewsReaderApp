package com.example.newsreader.presentation.articles

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsreader.data.NewsArticle
import com.example.newsreader.data.NewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor (private val newsRepository: NewsRepository) : ViewModel() {
    suspend fun getNewsArticles(): List<NewsArticle> {
//        viewModelScope.launch {
//            _newsArticles.value = newsRepository.getNewsArticles()
//        }
//        return _newsArticles
        return newsRepository.getNewsArticles()
    }

    private val _newsArticles = MutableLiveData<List<NewsArticle>>()
    val newsArticles: LiveData<List<NewsArticle>>
    get() = _newsArticles

    init {
        viewModelScope.launch {
            _newsArticles.value = newsRepository.getNewsArticles()
        }
    }
}
