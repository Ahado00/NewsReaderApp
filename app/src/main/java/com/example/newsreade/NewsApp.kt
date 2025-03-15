package com.example.newsreade

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue


@Composable
fun NewsApp() {
    var isBookmarked by remember { mutableStateOf(false) }
    var selectedArticle by remember { mutableStateOf<NewsArticle?>(null) }

    val newsArticles = listOf(
        NewsArticle("Breaking News: Market Crash", "The stock market faced a significant crash today...", "2025-03-15"),
        NewsArticle("Tech Giant Acquires Startup", "In a major deal, a tech giant has acquired a promising startup...", "2025-03-14")
    )

    if (selectedArticle == null) {
        NewsFeedScreen(newsArticles) { article ->
            selectedArticle = article
        }
    } else {
        selectedArticle?.let { article ->
            NewsDetailScreen(newsArticle = article, isBookmarked = isBookmarked) {
                isBookmarked = !isBookmarked
            }
        }
    }
}