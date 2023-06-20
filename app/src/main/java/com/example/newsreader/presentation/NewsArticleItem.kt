package com.example.newsreader.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.newsreader.data.NewsArticle

@Composable
fun NewsArticleItem(article: NewsArticle, onClick: (article: NewsArticle) -> Unit) {

    Card( modifier = Modifier.clickable{ onClick(article) }
        .padding(8.dp)
    ) {
        Text(text = article.title, style = MaterialTheme.typography.bodyLarge)
        Text(text = article.description, style = MaterialTheme.typography.bodyMedium)
    }

}