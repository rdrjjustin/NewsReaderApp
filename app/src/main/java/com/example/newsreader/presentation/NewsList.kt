package com.example.newsreader.presentation

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.newsreader.data.NewsArticle

@Composable
fun NewsList(articles: List<NewsArticle>, onClick: (article: NewsArticle) -> Unit) {
    LazyColumn {
        items(articles) {article ->
            NewsArticleItem(article = article, onClick)
        }
    }
}