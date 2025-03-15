package com.example.newsreade

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable

@Composable
fun NewsFeedScreen(newsArticles: List<NewsArticle>, onItemClick: (NewsArticle) -> Unit) {
    LazyColumn {
        items(newsArticles) { article ->
            NewsItem(newsArticle = article, onItemClick)
        }
    }
}