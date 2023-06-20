package com.example.newsreader.presentation.articles

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.produceState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.newsreader.data.NewsArticle
import com.example.newsreader.presentation.NewsList

@Composable
fun NewsScreen(newsViewModel: NewsViewModel) {
    //val newsArticles by newsViewModel.newsArticles.observeAsState(emptyList())

    val newsArticless = produceState<List<NewsArticle>>(initialValue = emptyList()) {
        value = newsViewModel.getNewsArticles()
    }

    Column(modifier = Modifier.fillMaxSize()) {
        if (newsArticless.value.isNotEmpty()) {
            NewsList(newsArticless.value) {
                Log.e("rudresh", "${it.author}: clicked ")
            }
        } else {
            CircularProgressIndicator(modifier = Modifier.align(Alignment.CenterHorizontally))
        }
    }

//    Column(modifier = Modifier.fillMaxSize()) {
//        if (newsArticles.isNotEmpty()) {
//            NewsList(newsArticles) {
//                Log.e("rudresh", "${it.author}: clicked ")
//            }
//        } else {
//            CircularProgressIndicator(modifier = Modifier.align(Alignment.CenterHorizontally))
//        }
//    }
}

